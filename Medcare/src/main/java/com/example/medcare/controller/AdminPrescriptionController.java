package com.example.medcare.controller;

import com.example.medcare.model.Prescription;
import com.example.medcare.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminPrescriptionController {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @GetMapping("/admin/prescriptions")
    public String viewPrescriptions(Model model) {
        List<Prescription> prescriptions = prescriptionRepository.findAll(Sort.by(Sort.Direction.DESC, "uploadedAt"));
        model.addAttribute("prescriptions", prescriptions);
        return "admin/admin-prescriptions";
    }

    @PostMapping("/admin/prescriptions/reply")
    public String replyPrescription(@RequestParam("id") Long id,
                                    @RequestParam("status") String status,
                                    @RequestParam("adminReply") String adminReply) {
        Prescription prescription = prescriptionRepository.findById(id).orElse(null);
        if (prescription != null) {
            prescription.setStatus(status);
            prescription.setAdminReply(adminReply);
            prescriptionRepository.save(prescription);
        }
        return "redirect:/admin/prescriptions";
    }
}
