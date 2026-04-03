package com.example.medcare.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.example.medcare.model.HealthGoal;
import com.example.medcare.model.HealthRecord;
import com.example.medcare.model.MedicationReminder;
import com.example.medcare.model.Prescription;
import com.example.medcare.model.Product;
import com.example.medcare.model.User;
import com.example.medcare.repository.HealthGoalRepository;
import com.example.medcare.repository.HealthRecordRepository;
import com.example.medcare.repository.MedicationReminderRepository;
import com.example.medcare.repository.PrescriptionRepository;
import com.example.medcare.repository.ProductRepository;
import com.example.medcare.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MyHealthController {

    @Autowired
    private HealthRecordRepository recordRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private HealthGoalRepository goalRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @Autowired
    private MedicationReminderRepository reminderRepository;

    @GetMapping("/my-health")
    public String myHealthDashboard(Model model, Principal principal) {
        String username = principal.getName();
        
        // Fetch all records ordered by date DESC (newest first)
        List<HealthRecord> records = recordRepository.findByUserUsernameOrderByDateDesc(username);
        model.addAttribute("records", records);

        double deltaWeight = 0;
        int deltaBPSys = 0;
        String deltaWeightMsg = "Chưa có đủ dữ liệu so sánh.";
        String deltaBPMsg = "Chưa có đủ dữ liệu so sánh.";

        HealthRecord latest = null;

        if (!records.isEmpty()) {
            latest = records.get(0);
            model.addAttribute("latest", latest);

            // Compare with the previous record if exists
            if (records.size() > 1) {
                HealthRecord previous = records.get(1);

                deltaWeight = Math.round((latest.getWeight() - previous.getWeight()) * 10.0) / 10.0;
                deltaWeightMsg = deltaWeight > 0 ? "Tăng " + deltaWeight + " kg" : 
                                 (deltaWeight < 0 ? "Giảm " + Math.abs(deltaWeight) + " kg" : "Không đổi");

                if (latest.getBloodPressureSys() != null && previous.getBloodPressureSys() != null) {
                    deltaBPSys = latest.getBloodPressureSys() - previous.getBloodPressureSys();
                    deltaBPMsg = deltaBPSys > 0 ? "Tăng " + deltaBPSys + " mmHg" : 
                                 (deltaBPSys < 0 ? "Giảm " + Math.abs(deltaBPSys) + " mmHg" : "Ổn định");
                }
            }
        }

        model.addAttribute("deltaWeightMsg", deltaWeightMsg);
        model.addAttribute("deltaWeightValue", deltaWeight);
        model.addAttribute("deltaBPMsg", deltaBPMsg);

        // ================= SMART RECOMMENDATIONS =================
        List<Product> allProducts = productRepository.findAll();
        List<Product> recommendedProducts = new ArrayList<>();
        String actionPlan = "Hệ thống đang thu thập dữ liệu về sức khỏe của bạn. Vui lòng nhập số đo mới nhất để AI Medcare đưa ra phân tích!";
        String insightTitle = "Chưa Có Dữ Liệu";
        String insightColor = "info"; // bootstrap color class

        if (latest != null) {
            double bmi = latest.getBmi();
            
            // Default "Healthy" dynamic message
            insightTitle = "Tuyệt Vời! Cơ Thể Rất Khỏe Mạnh";
            insightColor = "success";
            String bpStatus = latest.getBloodPressureSys() != null ? "Huyết áp tâm thu đạt mức an toàn (" + latest.getBloodPressureSys() + " mmHg)." : "Các chỉ số cơ bản đang ổn định.";
            actionPlan = String.format("Chỉ số cơ thể (BMI) của bạn đang ở mức %.1f - cực kỳ lý tưởng! %s Cứ tiếp tục duy trì chế độ dinh dưỡng và thói quen sinh hoạt hiện tại bạn nhé. Để gia tăng sức đề kháng, bạn có thể tham khảo một số vitamin tổng hợp tự nhiên.", bmi, bpStatus);
            // Even healthy people should see related standard supplements
            recommendedProducts.addAll(findProductsByKeyword(allProducts, "Vitamin", "Đông y", "Nhân sâm", "Tăng đề kháng", "Canxi"));
            // BMI Based Recommendations
            if (bmi < 18.5) {
                insightTitle = "Cần Bổ Sung Dinh Dưỡng";
                insightColor = "info";
                actionPlan = "Phương án tuần này: Bạn đang thiếu cân. Hệ thống khuyên bạn nên tăng cường lượng Protein và Calo nạp vào cơ thể hàng ngày. Có thể chia làm 5-6 bữa ăn nhỏ. Dưới đây là các sản phẩm giàu dinh dưỡng hỗ trợ tăng cân an toàn từ Medcare.";
                // Simple keyword matching for demo purposes
                recommendedProducts.addAll(findProductsByKeyword(allProducts, "Whey", "Sữa", "Protein", "Tăng cân", "Vitamin"));
            } else if (bmi >= 25) {
                insightTitle = "Cần Theo Dõi Cân Nặng";
                insightColor = "warning";
                actionPlan = "Phương án tuần này: BMI của bạn đang ở mức Thừa cân. Bạn nên cắt giảm 30% lượng tinh bột (Carb) vào bữa tối, đồng thời kết hợp Cardio 30 phút mỗi ngày. Tham khảo các sản phẩm trà thanh lọc hoặc detox dưới đây để hỗ trợ đốt mỡ tự nhiên.";
                recommendedProducts.addAll(findProductsByKeyword(allProducts, "Trà xanh", "Detox", "Giảm cân", "Diet", "Caffeine"));
            }

            // Blood Pressure Based Recommendations
            if (latest.getBloodPressureSys() != null) {
                if (latest.getBloodPressureSys() >= 140) {
                    insightTitle = "Chú Ý Huyết Áp Cao";
                    insightColor = "danger";
                    actionPlan = "🚨 CẢNH BÁO: Huyết áp tâm thu của bạn đang ở mức cao (>= 140). Bạn cần giảm lượng muối trong khẩu phần ăn ngay lập tức và tham khảo ý kiến bác sĩ. Các sản phẩm hỗ trợ tim mạch như Omega-3 hay Tỏi đen rất tốt cho bạn lúc này.";
                    recommendedProducts.clear(); // BP taking priority for recommendations
                    recommendedProducts.addAll(findProductsByKeyword(allProducts, "Omega", "Tim mạch", "Tỏi", "CoQ10", "DHA"));
                }
            }
        }

        // If no specifically matched products but we have records, just show some random supplements
        if (recommendedProducts.isEmpty() && !allProducts.isEmpty() && latest != null) {
            recommendedProducts = allProducts.subList(0, Math.min(4, allProducts.size()));
        }

        model.addAttribute("insightTitle", insightTitle);
        model.addAttribute("insightColor", insightColor);
        model.addAttribute("actionPlan", actionPlan);
        model.addAttribute("recommendedProducts", recommendedProducts);

        // ================= TARGET GOAL TRACKING (AI AUTONOMOUS) =================
        if (latest != null && latest.getHeight() > 0) {
            double heightM = latest.getHeight() / 100.0;
            double current = latest.getWeight();
            double idealWeight = 22.0 * heightM * heightM; // Golden BMI 22.0
            idealWeight = Math.round(idealWeight * 10.0) / 10.0;
            
            double diff = current - idealWeight;
            diff = Math.round(diff * 10.0) / 10.0;
            
            String aiGoalAdvice = "";
            String aiGoalTitle = "";
            String aiGoalIcon = "";
            String aiGoalColor = "";
            int aiGoalProgress = 100;
            
            double bmi = latest.getBmi();

            if (bmi >= 25.0) { // Overweight/Obese
                double weeksToLose = Math.round(Math.abs(diff) / 0.5); // Safe loss: 0.5kg/week
                if(weeksToLose < 1) weeksToLose = 1;
                aiGoalTitle = "Cần Giảm Cân";
                aiGoalIcon = "fa-solid fa-arrow-down";
                aiGoalColor = "text-danger";
                aiGoalAdvice = String.format("Bạn đang vượt chuẩn! AI phân tích bạn cần GIẢM %.1f kg (về mức lý tưởng %.1f kg). Lộ trình an toàn: Giảm 0.5kg/tuần trong %d tuần.", Math.abs(diff), idealWeight, (int)weeksToLose);
                aiGoalProgress = Math.max(10, 100 - (int)(Math.abs(diff) * 5)); // Just a visual proxy
            } else if (bmi < 18.5) { // Underweight
                double weeksToGain = Math.round(Math.abs(diff) / 0.5); 
                if(weeksToGain < 1) weeksToGain = 1;
                aiGoalTitle = "Cần Tăng Cân";
                aiGoalIcon = "fa-solid fa-arrow-up";
                aiGoalColor = "text-warning";
                aiGoalAdvice = String.format("Bạn đang cần bổ sung dinh dưỡng! Hệ thống đề xuất TĂNG %.1f kg (lên mức lý tưởng %.1f kg). Lộ trình an toàn: Tăng 0.5kg/tuần trong %d tuần.", Math.abs(diff), idealWeight, (int)weeksToGain);
                aiGoalProgress = Math.max(10, 100 - (int)(Math.abs(diff) * 5));
            } else { // Normal
                aiGoalTitle = "Hoàn Hảo!";
                aiGoalIcon = "fa-solid fa-star";
                aiGoalColor = "text-success";
                aiGoalAdvice = String.format("Cực kỳ lý tưởng! Cơ thể bạn (BMI %.1f) đã đạt chuẩn Vàng. Cân nặng %.1f kg là điểm 10 tuyệt đối. Hãy tiếp tục duy trì thành quả này nhé!", bmi, current);
                aiGoalProgress = 100;
            }
            
            model.addAttribute("aiGoalActive", true);
            model.addAttribute("aiGoalTitle", aiGoalTitle);
            model.addAttribute("aiGoalIcon", aiGoalIcon);
            model.addAttribute("aiGoalColor", aiGoalColor);
            model.addAttribute("aiGoalAdvice", aiGoalAdvice);
            model.addAttribute("aiGoalProgress", aiGoalProgress);
        } else {
            model.addAttribute("aiGoalActive", false);
        }

        List<String> funQuotes = List.of(
            "💊 Ăn quả nhớ kẻ trồng cây, uống thuốc nhớ rót cốc nước đầy nha người anh em!",
            "🔔 Mình có thể lỡ hẹn với Crush, nhưng tuyệt đối đừng quên uống thuốc hôm nay nhé!",
            "🛡️ Một ngày không thuốc thì bệnh chẳng thuyên giảm, mau thiết lập lịch nhắc nhở ngay thôi!",
            "💎 Sức khỏe là vàng, uống thuốc đúng giờ là kim cương. Đừng để quên!"
        );
        String randomQuote = funQuotes.get(new java.util.Random().nextInt(funQuotes.size()));
        model.addAttribute("reminderEmptyQuote", randomQuote);

        // ================= PRESCRIPTION (MEDICAL RECORDS) =================
        User user = userRepository.findByUsername(username).orElse(null);
        if (user != null) {
            List<Prescription> prescriptions = prescriptionRepository.findByUserOrderByUploadedAtDesc(user);
            model.addAttribute("prescriptions", prescriptions);

            // ================= MEDICATION REMINDERS =================
            List<MedicationReminder> reminders = reminderRepository.findByUserOrderByReminderTimeAsc(user);
            model.addAttribute("reminders", reminders);
        }

        return "my-health";
    }

    @PostMapping("/my-health/goal")
    public String setTargetGoal(@RequestParam("targetWeight") Double targetWeight, Principal principal) {
        String username = principal.getName();
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        HealthGoal goal = goalRepository.findByUserUsername(username).orElse(new HealthGoal());
        goal.setUser(user);
        goal.setTargetWeight(targetWeight);
        goalRepository.save(goal);

        return "redirect:/my-health";
    }

    @PostMapping("/my-health/prescription")
    public String uploadPrescription(Prescription prescription, 
                                     @RequestParam(value = "imageFile", required = false) MultipartFile file,
                                     Principal principal,
                                     RedirectAttributes redirectAttrs) {
        String username = principal.getName();
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (file != null && !file.isEmpty()) {
            try {
                String uploadDir = new File("src/main/resources/static/images/prescriptions").getAbsolutePath();
                File directory = new File(uploadDir);
                if (!directory.exists()) {
                    directory.mkdirs();
                }

                String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename().replaceAll("[^a-zA-Z0-9\\.\\-]", "_");
                File saveFile = new File(uploadDir, fileName);
                file.transferTo(saveFile);
                
                prescription.setImageUrl("/images/prescriptions/" + fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        prescription.setUser(user);
        prescription.setUploadedAt(java.time.LocalDateTime.now());
        prescription.setStatus("CHỜ DUYỆT"); // Always start as pending
        prescriptionRepository.save(prescription);

        // ==== SIMULATE AI OCR EXTRACTION ====
        simulateAIExtraction(user);
        redirectAttrs.addFlashAttribute("uploadSuccess", "✅ Trích xuất thành công! AI nhận diện hình ảnh toa thuốc đã tạo lịch uống tự động cho bạn.");

        return "redirect:/my-health";
    }

    @PostMapping("/my-health/prescription/delete/{id}")
    public String deletePrescription(@org.springframework.web.bind.annotation.PathVariable Long id, Principal principal, RedirectAttributes redirectAttrs) {
        String username = principal.getName();
        User user = userRepository.findByUsername(username).orElse(null);
        if (user != null) {
            prescriptionRepository.findById(id).ifPresent(p -> {
                if (p.getUser().getId().equals(user.getId())) {
                    // Xóa toa thuốc
                    prescriptionRepository.delete(p);
                    
                    // Xóa toàn bộ lịch uống thuốc liên quan AI (hoặc toàn bộ) để lịch trống
                    List<MedicationReminder> reminders = reminderRepository.findByUserOrderByReminderTimeAsc(user);
                    reminderRepository.deleteAll(reminders);

                    redirectAttrs.addFlashAttribute("uploadSuccess", "✅ Đã xóa đơn thuốc và làm trống toàn bộ lịch nhắc nhở thành công!");
                }
            });
        }
        return "redirect:/my-health";
    }

    private void simulateAIExtraction(User user) {
        String[] meds = {"Paracetamol 500mg", "Kháng sinh Amoxicillin", "Vitamin C sủi", "Men tiêu hóa Enterogermina", "Omega-3 Dầu cá", "Siro Ho Bổ Phế", "Thuốc mỡ đục"};
        String[] times = {"08:00", "12:00", "20:00", "07:30", "19:00", "13:30"};
        
        java.util.Random rand = new java.util.Random();
        int numReminders = rand.nextInt(3) + 1; // 1 to 3 reminders generated
        
        for (int i = 0; i < numReminders; i++) {
            MedicationReminder reminder = new MedicationReminder();
            reminder.setUser(user);
            reminder.setMedicationName("[OCR AI] " + meds[rand.nextInt(meds.length)]);
            reminder.setReminderTime(java.time.LocalTime.parse(times[rand.nextInt(times.length)]));
            reminder.setDurationDays((rand.nextInt(5) + 1) * 2); // random duration
            reminder.setIsActive(true);
            reminderRepository.save(reminder);
        }
    }

    @PostMapping("/my-health/reminder")
    public String addReminder(MedicationReminder reminder, Principal principal) {
        String username = principal.getName();
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        reminder.setUser(user);
        reminder.setIsActive(true);
        reminderRepository.save(reminder);

        return "redirect:/my-health";
    }

    private List<Product> findProductsByKeyword(List<Product> all, String... keywords) {
        return all.stream()
            .filter(p -> {
                String name = p.getName().toLowerCase();
                String desc = (p.getDescription() != null) ? p.getDescription().toLowerCase() : "";
                for (String word : keywords) {
                    if (name.contains(word.toLowerCase()) || desc.contains(word.toLowerCase())) {
                        return true;
                    }
                }
                return false;
            })
            .limit(4) // Max 4 recommendations
            .collect(Collectors.toList());
    }
}
