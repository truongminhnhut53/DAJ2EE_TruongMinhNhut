package com.example.medcare.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArticleMockData {
    public static List<Map<String, Object>> getArticles() {
        List<Map<String, Object>> articles = new ArrayList<>();
        int id = 1;

        // --- DINH DƯỠNG ---
        articles.add(create(id++, "Dinh dưỡng", "/images/articles/dinhduong.png", "#0ea5e9", "fa-apple-whole", "BS. Minh Tâm", "Khoa Dinh dưỡng",
                "Sự thật về Eat Clean: Ăn sao cho đúng để không suy nhược?",
                "Nhiều người lầm tưởng Eat Clean là phải cắt bỏ hoàn toàn gia vị và tinh bột, dẫn đến chóng mặt, rụng tóc. Hãy cùng tìm hiểu cách ăn đúng.",
                "<p>Ăn <strong>Clean</strong> không có nghĩa là bạn phải ăn ức gà luộc trắng bệch mỗi ngày. Trọng tâm của Eat Clean là tiêu thụ thực phẩm ở dạng nguyên thủy nhất: ngũ cốc nguyên cám, rau củ tươi, trái cây, protein nạc và chất béo tốt.</p><h4>Sai lầm thường gặp:</h4><ul><li>Cắt hoàn toàn tinh bột: Não bộ cần Carb để hoạt động. Việc cắt giảm đột ngột gây choáng váng.</li><li>Loại bỏ muối/đường: Ăn nhạt quá mức làm mất cân bằng điện giải.</li></ul><p>Lời khuyên là hãy cân bằng đủ Nhóm chất (Đường bột - Đạm - Béo - Vitamin) và đừng biến bữa ăn thành một hình phạt tinh thần.</p>"));

        articles.add(create(id++, "Dinh dưỡng", "/images/articles/dinhduong.png", "#0ea5e9", "fa-apple-whole", "BS. Minh Tâm", "Khoa Dinh dưỡng",
                "Chế độ ăn Keto có thực sự thần thánh như lời đồn?",
                "Keto đang trở thành trào lưu giảm cân toàn cầu. Nhưng đưa cơ thể vào trạng thái Ketosis liệu có an toàn tuyệt đối cho nội tạng?",
                "<p><strong>Keto (Ketogenic)</strong> đòi hỏi bạn nạp đến 70-80% chất béo, 15-20% protein và dưới 5% carbohydrate. Điều này ép gan phải sản xuất ketone để làm nguyên liệu thay thế cho glucose.</p><h4>Ai KHÔNG nên tập Keto?</h4><p>Người có tiền sử bệnh lý về gan, tuyến tụy hoặc mỡ máu cao tuyệt đối không nên theo Keto mà không có y lệnh. Sự gia tăng đột biến của chất béo bão hòa có thể gây quá tải cho bộ máy nội tạng.</p><p>Thay vì chạy theo trào lưu, một thực đơn kiểm soát Calorie In < Calorie Out vẫn là chân ái bền vững nhất.</p>"));

        articles.add(create(id++, "Dinh dưỡng", "/images/articles/dinhduong.png", "#0ea5e9", "fa-apple-whole", "BS. Minh Tâm", "Khoa Dinh dưỡng",
                "Giải mã cơn thèm ngọt: Phải làm sao khi 'nghiện' trà sữa?",
                "Đường có tính gây nghiện không kém gì các chất kích thích. Đây là pháp đồ cai nghiện đường 3 bước cho tín đồ hảo ngọt.",
                "<p>Nghiên cứu chỉ ra rằng đường kích thích bán cầu não tiết ra lượng lớn <strong>Dopamine</strong> - hormone hạnh phúc, khiến bạn liên tục thâm hụt và thèm khát nó sau 2 tiếng.</p><h4>Cách xử lý triệt để:</h4><ul><li>Trái cây ngọt: Thay 1 ly trà sữa bằng 1 quả táo hoặc chuối. Fructose tự nhiên đi kèm chất xơ làm chậm hấp thu đường.</li><li>Uống nhiều nước: Đôi khi não bộ nhầm lẫn giữa tín hiệu 'khát' và 'đói đường'.</li><li>Cắt giảm từ từ: Giảm từ 100% đường xuống 70%, 50% rồi 30% thay vì bỏ ngang để tránh hội chứng cai nghiện.</li></ul>"));

        articles.add(create(id++, "Dinh dưỡng", "/images/articles/dinhduong.png", "#0ea5e9", "fa-apple-whole", "BS. Minh Tâm", "Khoa Dinh dưỡng",
                "Intermittent Fasting (Nhịn ăn gián đoạn): Hướng dẫn chi tiết cho người mới",
                "IF 16/8 là gì? Cách cơ thể tự 'thực bào' dọn dẹp tế bào lỗi khi bạn nhịn ăn giúp kéo dài tuổi thọ cực kì kinh ngạc.",
                "<p><strong>Intermittent Fasting (IF)</strong> giải phóng insulin về mức nền, cho phép phân giải mỡ tế bào thành năng lượng.</p><h4>Khung giờ vàng 16/8:</h4><p>Bạn nhịn ăn 16 tiếng và chỉ nạp calo trong khung 8 tiếng (Ví dụ từ 12h trưa đến 8h tối). Trong 16 tiếng nhịn, cơ thể sẽ diễn ra quá trình <em>Autophagy (Thực bào)</em>, tự động tiêu hóa các tế bào già yếu và tái tạo mô mới.</p><p>Tuy nhiên, IF không dành cho người bị viêm loét dạ dày mãn tính hay phụ nữ đang mang thai.</p>"));

        articles.add(create(id++, "Dinh dưỡng", "/images/articles/dinhduong.png", "#0ea5e9", "fa-apple-whole", "BS. Minh Tâm", "Khoa Dinh dưỡng",
                "Cách đọc bảng thành phần dinh dưỡng trên bao bì thực phẩm",
                "Khoa học đã chứng minh: Đừng bị lừa bởi những nhãn mác 'Ít béo', 'Không đường'. Hãy nhìn vào mặt sau của bao bì sản phẩm.",
                "<p>Các nhà sản xuất thực phẩm rất giỏi việc 'ngụy trang' lượng calo.</p><h4>3 Thông số cần nhìn ngay:</h4><ul><li><strong>Serving Size (Khẩu phần):</strong> Bao bì ghi 100kcal nhưng khẩu phần chỉ là 1/4 gói. Nếu bạn ăn cả gói, lượng calo thực sự là 400!</li><li><strong>Hidden Sugar:</strong> Đường được giấu dưới hơn 60 cái tên khác nhau: Corn syrup, Dextrose, Fructose... Đừng để chữ 'No Sugar' lừa mị.</li><li><strong>Trans Fat:</strong> Kẻ thù số 1 của tim mạch. Dù hàm lượng là 0.5g/khẩu phần nhưng nó tích tụ mãi mãi trong thành mạch bạch huyết.</li></ul>"));

        articles.add(create(id++, "Dinh dưỡng", "/images/articles/dinhduong.png", "#0ea5e9", "fa-apple-whole", "BS. Minh Tâm", "Khoa Dinh dưỡng",
                "Protein thực vật vs Protein động vật: Cái nào tốt hơn cho cơ bắp?",
                "Có thể xây dựng cơ bắp cuồn cuộn nếu chỉ ăn thuần chay? Bài viết bóc trần khác biệt về tiểu phân tử Amino acids.",
                "<p>Nhiều gymer tin rằng chỉ có Ức gà hay Thịt bò mới đem lại lượng đạm lý tưởng. Điều này chỉ đúng một nửa.</p><h4>Hồ sơ Amino Acids:</h4><p>Protein động vật cung cấp ĐẦY ĐỦ 9 loại axit amin thiết yếu. Protein thực vật thường thiếu hụt một trong số đó (ví dụ đậu nành thiếu Methionine).</p><p><strong>Giải pháp cho người ăn chay:</strong> Bạn phải kết hợp các loại thực vật với nhau. Ví dụ: Ăn gạo lứt cùng với các loại đậu sẽ tạo nên một dải Amino Acids hoàn hảo không thua kém thịt bò.</p>"));

        // --- TẬP LUYỆN ---
        articles.add(create(id++, "Tập luyện", "/images/articles/tapluyen.png", "#f59e0b", "fa-dumbbell", "HLV. Hoàng Khang", "Chuyên gia Hình thể",
                "Cardio hay Nâng tạ: Đâu mới là chân ái để đốt mỡ thừa?",
                "Rất nhiều chị em chỉ cắm cúi chạy bộ trên máy mà sợ nâng tạ sẽ 'đô con'. Đó là lầm tưởng lớn cản trở việc sắc vóc thon thả.",
                "<p>Cardio như chạy bộ giúp đốt mỡ cực đỉnh *TRONG* lúc tập. Kéo lê trên máy chạy 1 tiếng tốn khoảng 400 calo.</p><h4>Nhưng Nâng tạ mới là phép màu:</h4><p>Nâng tạ tạo ra các vết rách vi cơ, khiến cơ thể mất thêm năng lượng để phục hồi trong 48 GIỜ TIẾP THEO (Hiệu ứng After-burn). Thêm cơ bắp nghĩa là trao đổi chất cơ bản (BMR) tăng lên, bạn nằm ngủ không cũng đốt mỡ nhanh hơn người bình thường.</p><p>Vậy nên: Kết hợp 3 phần tạ, 1 phần cardio là hoàng kim.</p>"));

        articles.add(create(id++, "Tập luyện", "/images/articles/tapluyen.png", "#f59e0b", "fa-dumbbell", "HLV. Hoàng Khang", "Chuyên gia Hình thể",
                "5 bài tập chữa đau lưng cho dân văn phòng ngồi nhiều",
                "Chứng thoái hóa cột sống đang trẻ hóa cực độ vì dân văn phòng ngồi gù lưng 10 tiếng/ngày. Hãy đứng lên và tập ngay 5 động tác này.",
                "<p>Cơn đau thắt lưng thường bắt nguồn từ cơ mông bị yếu đi do ngồi quá lâu (Glute Amnesia). Dưới đây là phác đồ cho bạn:</p><ul><li><strong>Cat-Cow Pose:</strong> Động tác giải phóng áp lực từng đốt sống lưng. Làm 10 lần mỗi sáng.</li><li><strong>Glute Bridge (Cây cầu):</strong> Nằm ngửa đẩy hông lên cao để kích hoạt lại cơ mông.</li><li><strong>Bird-Dog:</strong> Bài tập vàng để ổn định cơ lõi (Core) và xương chậu sau hàng giờ liền ngồi lệch vẹo.</li></ul>"));

        articles.add(create(id++, "Tập luyện", "/images/articles/tapluyen.png", "#f59e0b", "fa-dumbbell", "HLV. Hoàng Khang", "Chuyên gia Hình thể",
                "Tập luyện theo chu kỳ kinh nguyệt: Tối ưu hoá năng lượng phái nữ",
                "Đừng ép bản thân đẩy tạ nặng khi năng lượng tuột dốc. Tận dụng hoocmon nữ giới để bứt phá thể lực theo chu kỳ 28 ngày.",
                "<p>Việc hiểu rõ dòng chảy nội tiết tố (Estrogen và Progesterone) là chìa khóa để tập tành không mệt mỏi.</p><h4>Các Giai đoạn:</h4><p><strong>Ngày 1-5 (Kinh nguyệt):</strong> Năng lượng thấp. Hãy ưu tiên tĩnh dưỡng, đi bộ nhẹ hoặc Yin Yoga.</p><p><strong>Ngày 6-14 (Nang noãn):</strong> Estrogen đạt đỉnh cực đại! Đây là lúc cơ bắp chịu đựng siêu tốt. Hãy đẩy tạ thật nặng và HIIT bung lụa.</p><p><strong>Ngày 15-28 (Hoàng thể):</strong> Cơ thể tích tụ nước, dễ cáu kỉnh. Cardio vừa phải, duy trì mức tạ sẽ hợp lý hơn.</p>"));

        articles.add(create(id++, "Tập luyện", "/images/articles/tapluyen.png", "#f59e0b", "fa-dumbbell", "HLV. Hoàng Khang", "Chuyên gia Hình thể",
                "Giãn cơ tĩnh và giãn cơ động: Đừng nhầm lẫn trước khi tập!",
                "90% chấn thương trật khớp đến từ việc người tập thực hiện sai quy trình khởi động và giãn cơ ngớ ngẩn.",
                "<p>Khởi động sai còn tồi tệ hơn không khởi động.</p><h4>Nghịch lý Giãn cơ tĩnh:</h4><p>Kéo dãn cơ gân khoeo và giữ yên trong 30 giây TRƯỚC BỔI TẬP (Giãn cơ tĩnh) sẽ làm triệt tiêu lực đàn hồi của sợi cơ, khiến bạn yếu đi 10% khi đẩy tạ! Giãn tĩnh chỉ dành cho việc LÀM NGUỘI sau tập.</p><p>TRƯỚC khi tập, bắt buộc phải dùng <strong>Giãn cơ động (Dynamic Stretching)</strong>: Xoay vòng tay, lunges đi bộ, bật nhảy jack... để bơm máu trực tiếp cơ học.</p>"));

        articles.add(create(id++, "Tập luyện", "/images/articles/tapluyen.png", "#f59e0b", "fa-dumbbell", "HLV. Hoàng Khang", "Chuyên gia Hình thể",
                "Chạy bộ đúng kỹ thuật: Bí quyết không hỏng khớp gối",
                "Hàng vạn người bị đứt dây chằng hay mòn sụn chêm vì đập gót chân chát chát xuống đường nhựa mỗi sáng.",
                "<p>Nhiều người nghĩ chạy bộ chỉ là xỏ giày và cắm đầu chạy. Hậu quả là cơn đau đầu gối dai dẳng.</p><h4>Mẹo nhỏ bảo vệ khớp:</h4><ul><li><strong>Tiếp đất:</strong> Phải tiếp đất bằng TẬN GIỮA BÀN CHÂN (Mid-foot), không bao giờ cố vươn sải chân tiếp đất bằng gót.</li><li><strong>Độ nghiêng (Cadence):</strong> Nhịp chân chuẩn là 180 bước/phút. Càng sải ngắn, tốc độ đáp đất càng nhẹ, phản lực triệt tiêu lên hông thay vì cắm thẳng vào sụn gối.</li></ul>"));

        articles.add(create(id++, "Tập luyện", "/images/articles/tapluyen.png", "#f59e0b", "fa-dumbbell", "HLV. Hoàng Khang", "Chuyên gia Hình thể",
                "Phá vỡ 'điểm chững' (Plateau) trong quá trình tăng cơ giảm mỡ",
                "Đã ăn kiêng cực đoan, đã tập điên cuồng tháng này qua tháng nọ nhưng cân nặng vẫn không lay chuyển? Bạn đang bị mắc kẹt tại Plateau.",
                "<p>Cơ thể con người thông minh tới mức nó có thể tự 'thích nghi tinh luyện' để sinh tồn. Khi bạn tập 1 giáo án quá 2 tháng, hệ thần kinh trung ương quen với nhịp tạ, nó sẽ dùng ít năng lượng hơn để hoàn thành bài đó.</p><h4>Giải pháp: Cú Sốc Tích Cực</h4><p>Hãy làm cơ thể hoang mang! Thay đổi mọi thứ: Nếu bạn quen đẩy ngực tạ đòn, hãy thử tạ đơn. Nếu bạn nghỉ 1 phút, hãy ép xuống 30 giây (Drop-set). Hoặc đôi khi, ăn vọt lên 500 calo trong 1 ngày (Cheatday) để khôi phục hormone tuyến giáp Leptin.</p>"));

        articles.add(create(id++, "Tập luyện", "/images/articles/tapluyen.png", "#f59e0b", "fa-dumbbell", "HLV. Hoàng Khang", "Chuyên gia Hình thể",
                "HIIT 15 phút tại nhà: Đổ mồ hôi đầm đìa không cần dụng cụ",
                "Bạn luôn than thở không có đủ thời gian đến Gym? Khóa HIIT 15 phút này được thiết kế để bào mòn mỡ bụng cực độ ngay tại thảm phòng ngủ.",
                "<p>High Intensity Interval Training (HIIT) tận dụng chu kỳ nhịp tim đẩy lên kịch trần độ đập tối đa, sau đó cho nghỉ ngơi chớp nhoáng.</p><h4>Giáo án Tabata (Thực hiện 4 vòng):</h4><ul><li>Jumping Jacks: 40 giây (Nghỉ 20 giây)</li><li>Bật squat (Jump Squat): 40 giây (Nghỉ 20 giây)</li><li>Mountain Climber: 40 giây (Nghỉ 20 giây)</li><li>Burpees cường độ cao: 40 giây (Nghỉ 20 giây)</li></ul><p>Tập xong, cơ thể bạn sẽ biến thành cái lò sưởi đốt mỡ trong 12 giờ kế tiếp!</p>"));

        articles.add(create(id++, "Tập luyện", "/images/articles/tapluyen.png", "#f59e0b", "fa-dumbbell", "HLV. Hoàng Khang", "Chuyên gia Hình thể",
                "Tập Yoga có thực sự giảm cân không? Câu trả lời từ chuyên gia",
                "Cơ thể bay bổng, uốn lượn chậm rãi trong phòng tối. Có bao nhiêu calo được đốt đi trong 1 giò tập Yoga tĩnh?",
                "<p>Một buổi Hatha Yoga tĩnh cướp đi khoảng 150 - 200 calories, chỉ nhỉnh hơn nằm trên giường một chút. Nên sự thật thì Yoga cơ bản KHÔNG HỖ TRỢ GIẢM MỠ trực tiếp một cách hiệu quả.</p><h4>Nhưng tác dụng ẩn giấu là:</h4><p>Yoga giảm nồng độ Cortisol (Hormone sinh mỡ vùng bụng khi căng thẳng). Hơn nữa, nếu bạn tham gia **Ashtanga, Vinyasa hay Hot Yoga**, lượng calo đốt cháy sẽ vọt lên 400 - 500 kcal nhờ chuỗi động tác Power yêu cầu giữ cơ tĩnh rã rời chân tay.</p>"));

        // --- TÂM LÝ HỌC ---
        articles.add(create(id++, "Tâm lý học", "/images/articles/tamly.png", "#8b5cf6", "fa-brain", "ThS. Lan Hương", "Chuyên gia Tâm lý",
                "Hội chứng ngụy trang (Imposter Syndrome): Tại sao bạn luôn thấy mình kém cỏi?",
                "Bạn luôn cảm giác thành tựu của mình chỉ là do ăn may, lo sợ một ngày mọi người phát hiện mình thực chất là một 'kẻ lừa đảo' năng lực.",
                "<p>70% người trưởng thành ít nhất 1 lần trải qua <strong>Imposter Syndrome</strong>. Nó xảy ra khốc liệt nhất ở những cá nhân xuất sắc, những người theo chủ nghĩa hoàn hảo.</p><h4>Làm sao thoát khỏi nó?</h4><p>Hãy lập một 'Hộp thư khen ngợi'. Ghi lại mọi lời khen, mọi chứng chỉ hoặc review tốt của khách hàng về bạn. Khi cơn hoài nghi xâm chiếm não bộ, hãy mở chúng ra và đối thoại lại với tiếng nói gièm pha bên trong tâm trí mình bằng những FACT (Bằng chứng thực tiễn).</p>"));

        articles.add(create(id++, "Tâm lý học", "/images/articles/tamly.png", "#8b5cf6", "fa-brain", "ThS. Lan Hương", "Chuyên gia Tâm lý",
                "Toxic Positivity (Tích cực độc hại): Khi lời động viên trở thành nhát dao",
                "Đừng khóc nữa, ngoài kia còn bao người khổ hơn mày! - Đây chính là tiêu chuẩn của sự tích cực độc hại bóp chết sự cảm thông.",
                "<p><strong>Toxic Positivity</strong> là việc ép buộc bản thân hoặc người khác phải giữ thái độ nỗ lực lạc quan mặc kệ hoàn cảnh khốn cùng đến đâu. Việc chối bỏ cảm xúc 'tiêu cực' tự nhiên sẽ nén chặt nó thành những sang chấn bùng nổ.</p><h4>Cách lắng nghe chuẩn y khoa tâm lý:</h4><p>Thay vì nói: 'Mọi chuyện rồi sẽ ổn thôi, hãy vui lên!', bạn nên bao bọc cảm xúc nạn nhân bằng câu nói: 'Mình biết bạn đang trải qua chuyện vô cùng khó khăn, có mình ở đây để nghe bạn kể'. Đó mới là sức mạnh vỗ về.</p>"));

        articles.add(create(id++, "Tâm lý học", "/images/articles/tamly.png", "#8b5cf6", "fa-brain", "ThS. Lan Hương", "Chuyên gia Tâm lý",
                "Cách đối phó với Burnout (Kiệt sức) trong kỷ nguyên hối hả",
                "Phải làm gì khi sáng thức dậy bạn không tìm thấy bất kỳ mảnh động lực sống nào, chỉ mong tan biến khỏi môi trường làm việc nặng nề?",
                "<p>Burnout không chỉ là mỏi mệt thông thường. WHO phân loại đây là hội chứng ngấm ngầm do căng thẳng công việc kéo dài không được quản lý hiệu quả.</p><h4>3 Trụ cột tự phục hồi:</h4><ul><li><strong>Ranh giới (Boundaries):</strong> Xóa hoàn toàn app công việc sau giờ hành chính. Dám nói 'Không' với sự ép buộc của sếp.</li><li><strong>Detox Dopamine:</strong> Gỡ cài đặt Tik Tok hay Reels trong vòng 1 tuần, ép não bộ tìm kiếm động lực từ ánh nắng và các mối quan hệ đời thực.</li></ul>"));

        articles.add(create(id++, "Tâm lý học", "/images/articles/tamly.png", "#8b5cf6", "fa-brain", "ThS. Lan Hương", "Chuyên gia Tâm lý",
                "Gaslighting là gì? Dấu hiệu bạn đang bị thao túng tâm lý",
                "Có bao giờ bạn cãi nhau với người yêu, và kết cục bạn lại tin rằng chính mình mới là kẻ phản bội hay hoang tưởng?",
                "<p>Thuật ngữ <strong>Gaslighting (Thắp đèn ga)</strong> chỉ hành vi thao túng ác độc khiến bạn phải nghi ngờ chính những ký ức, cảm nhận và cả độ tỉnh táo tinh thần của bản thân mình.</p><h4>Dấu hiệu báo động:</h4><p>Kẻ bạo hành tâm lý thường chối bỏ một cách thản nhiên: 'Tôi chưa nói như vậy bao giờ, em điên rồi!' hoặc 'Em lại làm quá lên rồi đấy!'. Khi rơi vào tình trạng này, điều cần làm không phải là chống trả đôi co, mà là Tách Rời (Detachment) và tìm kiếm bên thứ ba đáng tin cậy hỗ trợ phân giải.</p>"));

        articles.add(create(id++, "Tâm lý học", "/images/articles/tamly.png", "#8b5cf6", "fa-brain", "ThS. Lan Hương", "Chuyên gia Tâm lý",
                "Thiền chánh niệm (Mindfulness): Phương thuốc miễn phí chữa mọi âu lo",
                "Không cần nhang khói hay áo tu hành, 10 phút tập trung vào hơi thở giữa nhịp đèn đỏ kẹt xe cũng chính là Thiền học hiện đại.",
                "<p>Mindfulness (Chánh niệm) cốt tủy là đưa 100% sự chú tâm về HIỆN TẠI ở giây phút này, không màng tương lai chưa đến, không than thở dĩ vãng đã qua.</p><h4>Bắt đầu thật đơn giản:</h4><p>Ngồi trên ghế, nhắm mắt lại. Cảm nhận không khí mát lạnh đi qua đầu mũi khi hít vào, hơi ấm lan tỏa khi thở ra. Chỉ vậy thôi. Khi não bộ suy nghĩ về tờ deadline chiều nay, hãy nhẹ nhàng nhận thức 'Ah, não tôi đang xao nhãng', rồi mỉm cười quay lại quan sát hơi thở.</p>"));

        // --- PHÒNG BỆNH ---
        articles.add(create(id++, "Phòng bệnh", "/images/articles/phongbenh.png", "#ef4444", "fa-shield-virus", "BS. Tấn Hùng", "Khoa Phòng chống dịch",
                "Cảnh báo: Dấu hiệu đột quỵ ở người trẻ và cách sơ cứu chuẩn",
                "Đột quỵ không còn là đặc quyền của người già. Nam thanh niên 25 tuổi thức khuya chơi game cũng có thể gục xuống não bộ.",
                "<p>Quy tắc sống còn <strong>FAST</strong> cứu mạng bệnh nhân não vỡ mạch máu:</p><ul><li><strong>F (Face) - MẶT:</strong> Yêu cầu bệnh nhân cười. Cảm nhận xem một bên mặt có bị trễ, xệ và không cân xứng.</li><li><strong>A (Arm) - TAY:</strong> Giơ hai tay lên cao. Đột quỵ sẽ khiến một tay thả lỏng buông thõng xuống không kiểm soát.</li><li><strong>S (Speech) - GIỌNG:</strong> Nói bập bẹ, cắn nhầm lưỡi, méo tiếng khó hiểu.</li><li><strong>T (Time) - GIỜ VÀNG:</strong> Đừng thử đâm kim nặn máu! Hãy bế bốc bệnh nhân lên xe Gọi ngay 115 trong vòng 3-4 tiếng đầu.</li></ul>"));

        articles.add(create(id++, "Phòng bệnh", "/images/articles/phongbenh.png", "#ef4444", "fa-shield-virus", "BS. Tấn Hùng", "Khoa Phòng chống dịch",
                "Bí kíp tăng cường hệ miễn dịch tự nhiên khi giao mùa",
                "Uống vitamin C sủi là không đủ. Đại đội vi khuẩn giao mùa đòi hỏi một 'tường thành' kiên cố hơn nhiều từ mâm cơm nhà.",
                "<p>70% hệ miễn dịch nằm ở hệ vi sinh vật Đường Ruột của bạn!</p><h4>Tiếp nạp vũ khí chống dịch:</h4><p>Đừng lạm dụng kháng sinh. Thuốc kháng sinh chỉ giết VI KHUẨN (Bacteria), không giết được Cúm VIRUS! Biện pháp thông thái là hãy ăn sữa chua lên men kẽm, bổ sung tỏi tươi, hành tây chứa allicin, phơi nắng để cơ thể tự hấp thu Vitamin D3 tạo thành các tế bào Lympho T dũng mãnh ngăn cản mầm mống xâm nhập.</p>"));

        articles.add(create(id++, "Phòng bệnh", "/images/articles/phongbenh.png", "#ef4444", "fa-shield-virus", "BS. Tấn Hùng", "Khoa Phòng chống dịch",
                "Ung thư dạ dày: Vi khuẩn HP lây qua đường nếm chung thức ăn?",
                "Văn hóa chấm chung bát nước mắm và gắp thức ăn chéo đũa của tổ tiên người Châu Á chính là con đường gieo rắc trực khuẩn HP viêm loét.",
                "<p>Vi khuẩn <strong>Helicobacter Pylori (HP)</strong> tồn tại mạnh mẽ nhất trong bọt nước bọt, chân răng và trong các mảng viêm dạ dày. Chúng là nguy cơ nguyên phát số 1 tạo ra 90% các ca Ung thư bao tử!</p><h4>Cách phòng tránh tuyệt đỉnh:</h4><p>Tuyệt đối không 'thổi' đồ ăn mớm cho em bé. Bạn có thể là người lành mang trùng vì sức đề kháng bạn mạnh, nhưng dạ dày của con nít thì không. Đừng ngần ngại sử dụng hệ 'Đũa chung bát riêng' chuẩn văn hóa ăn uống khoa học tương lai.</p>"));

        articles.add(create(id++, "Phòng bệnh", "/images/articles/phongbenh.png", "#ef4444", "fa-shield-virus", "BS. Tấn Hùng", "Khoa Phòng chống dịch",
                "Tất tần tật về Vaccine HPV: Đàn ông có cần tiêm không?",
                "Nếu bạn nghĩ Ung Thư Cổ Tử Cung chỉ đe doạ riêng phụ nữ thì lầm to. Nam giới là trạm sạc lây nhiễm virus papilloma người ghê rợn nhất.",
                "<p>Khoa học ghi nhận rõ: Nam giới nhiễm chủng HPV hoàn toàn dính phải nguy cơ viêm Ung thư biểu mô Vòm Họng, Viêm sùi mào gà sinh dục và cả ung thư hậu môn một cách âm thầm và đầy rủi ro sinh học.</p><h4>Thời điểm vàng:</h4><p>Quy trình tiêm Guardasil 9 bảo vệ cực mạnh nếu bạn chủ động tiêm phòng từ 9 đến 26 tuổi (cả nam lẫn nữ), và ngay cả khi đã vượt tuổi hay đã quan hệ tình dục, vắc xin vẫn khống chế được xác suất miễn nhiễm bùng phát chủng chéo. Khuyến cáo y khoa là: Hãy đi tiêm càng sớm càng tốt!</p>"));

        articles.add(create(id++, "Phòng bệnh", "/images/articles/phongbenh.png", "#ef4444", "fa-shield-virus", "BS. Tấn Hùng", "Khoa Phòng chống dịch",
                "Gan nhiễm mỡ không do rượu: Sát thủ thầm lặng thời đại mới",
                "Mẹ bỉm sữa, dân văn phòng chẳng bao giờ uống 1 giọt bia nhưng đi siêu âm Gan đỏng đảnh đầy mỡ? Hãy coi chừng fructose công nghiệp.",
                "<p>Bệnh Gan nhiễm mỡ không do cồn (NAFLD) xuất phát thẳng thắn từ việc bạn ăn quá liều Carbs và đường trái cây (Fructose).</p><h4>Hành trình phá hủy:</h4><p>Glucose thì cơ bắp còn đem ra làm năng lượng được. Fructose chỉ có thể chuyển hoá tại GAN. Khi bạn tọng liên tục sinh tố đóng chai dạt dào High Fructose Corn Syrup, lá Gan sẽ quá tải và chuyển hóa toàn bộ khoáng chất này thành Triglyceride mỡ xấu đắp ngay lên thành vách nội tạng! Hãy dừng lại việc uống đường công nghiệp ẩn giấu.</p>"));

        articles.add(create(id++, "Phòng bệnh", "/images/articles/phongbenh.png", "#ef4444", "fa-shield-virus", "BS. Tấn Hùng", "Khoa Phòng chống dịch",
                "Checklist khám sức khoẻ tổng quát cơ bản cho độ tuổi 20-30",
                "Phát hiện suy thận độ 1 hay hẹp van tim sớm ở tuổi 25 rẻ gấp hàng tỷ lần việc nằm lọc máu ở bệnh viện ung bướu năm 40 tuổi.",
                "<p>Giới trẻ 20 tuổi cậy vào thanh xuân, lười đi khám, lười chụp chiếu. Đến lúc mệt xỉu, chụp Xquang thì phổi đã hoại nửa.</p><h4>Chỉ định tầm soát định kì:</h4><ul><li><strong>Dịch tễ Mỡ Máu:</strong> Glucose đói, Cholesterol LDL/HDL (Rất nhiều người trẻ mỡ máu cực khủng).</li><li><strong>Chức năng Thận Gan:</strong> Chỉ số AST/ALT và Ure/Creatinin huyết thanh học.</li><li><strong>Siêu âm Bụng màng:</strong> Lướt phát hiện Sỏi Thận, sỏi mật, U nang buồng trứng chưa chèn ép.</li></ul>"));

        articles.add(create(id++, "Phòng bệnh", "/images/articles/phongbenh.png", "#ef4444", "fa-shield-virus", "BS. Tấn Hùng", "Khoa Phòng chống dịch",
                "Cận thị và ánh sáng xanh: Đeo kính chống lóa có thực sự bảo vệ mắt?",
                "Marketing gieo rắc nỗi sợ ánh sáng xanh để bán kính, nhưng khoa học cho thấy máy tính cướp đi sự minh mẫn của đôi mắt từ một lý do khác hoàn toàn.",
                "<p>Theo chuẩn khoa khoa Y Tế quốc tế Ophthalmology, bản thân Ánh Sáng Xanh từ màn hình máy tính không phải nguyên nhân hỏng võng mạc hay cận thị nhòe mờ. Nguyên nhân đích đến từ sự CĂNG THẲNG ĐIỀU TIẾT của cơ Thể Mi.</p><h4>Quy tắc 20-20-20 của hiệp hội nhãn khoa:</h4><p>Cứ 20 phút dán mắt vào Code hoặc Excel, bạn phải nghỉ ngơi 20 giây, và phóng mắt ra một vật xa xôi cách ít nhất 20 feet (6 mét). Điều này khiến cơ mắt nhả chùng thư giãn. Kết hợp nước mắt nhân tạo để chống khô sẽ tốt hơn vạn lần chiếc kính ảo ánh sáng xanh kia.</p>"));

        // --- TIN Y TẾ ---
        articles.add(create(id++, "Tin y tế", "/images/articles/tinyte.png", "#0284c7", "fa-earth-americas", "Toà soạn MedCare", "Bản tin Quốc tế",
                "FDA công bố phương thuốc mới điều trị dứt điểm Alzheimer?",
                "Sau nhiều thập kỷ bó tay nhìn mảng bám tinh bột đục khoét não người già, tín hiệu hưng khởi từ cục Hàng không - Dược phẩm Mỹ (FDA) đã vụt sáng.",
                "<p>Kháng thể đơn dòng đột phá mới (Lecanemab) được chứng minh lâm sàng vào cuối quý II có khả năng loại bỏ mảng bám <strong>Amyloid Beta</strong> độc hại tích tụ trong não bộ – nguyên nhân được cho là cốt lõi của căn bệnh suy giảm trí nhớ trầm trọng Alzheimer.</p><p>Dù chưa phải là một 'viên thần dược cải tử hoàn sinh', nhưng các hồ sơ bệnh án báo cáo tốc độ di căn của suy kiệt nhận thức đã bị kéo chậm tận 27%. Một bình minh sáng chói cho khoa thần kinh học lão khoa thời đại công nghệ y học gen đỉnh cao.</p>"));

        articles.add(create(id++, "Tin y tế", "/images/articles/tinyte.png", "#0284c7", "fa-earth-americas", "Toà soạn MedCare", "Bản tin Quốc tế",
                "Sự xâm lăng của Vi khuẩn siêu kháng kháng sinh: Y tế toàn cầu báo động",
                "Năm 2050 dự tính hàng vạn người sẽ tử vong chỉ vì xước một vết đinh sắt rỉ do lạm dụng bẻ liều kháng sinh lung tung.",
                "<p>Tổ chức Y tế Thế giới (WHO) chính thức công bố danh mục vi khuẩn bùng phát tạo thành 'Siêu vi' (Superbugs). Việc uống Amoxicillin vô tội vạ rải rác mỗi khi chảy mũi sơ sịa đã huấn luyện mầm mống đột biến có vòng đời miễn dịch cực nhanh với chính viên thuốc đó.</p><p>Các bác sĩ lâm sàng toàn cầu đang thắt chặt cấp phát y lệnh thuốc liều cao, phòng chặn một kỷ nguyên đen tối khi con người bị trả về thời kì y tế tiền sử không có thuốc sát vi sinh.</p>"));

        articles.add(create(id++, "Tin y tế", "/images/articles/tinyte.png", "#0284c7", "fa-earth-americas", "Toà soạn MedCare", "Bản tin Quốc tế",
                "Ứng dụng AI trong việc chẩn đoán hình ảnh: Tỉ lệ chính xác lên đến 99%",
                "Siêu máy tính được cho 'ăn' và rèn luyện chéo với hàng rào 3 triệu hình ảnh cộng hưởng từ MRI, vạch mặt tế bào ung mầm không thể chối từ.",
                "<p>Hệ thống mạng nơ ron tích chập thế giới y học vừa hoàn thiện module trích xuất bóng mờ phổi thông qua công nghệ Machine Learning cực đại. Độ phân giải độ tương phản thấp từ mắt thường bác sĩ nay được AI phủ quang phổ và đẩy chỉ báo cảnh giác đỏ khi khối u (tumor) ở giai đoạn nguyên thủy hạt mè.</p><p>Các trung tâm y khoa kỹ thuật số lớn đang đệ trình để áp phích trợ lý AI này trở thành Trợ lý đồng bộ của mọi y bác sĩ, đẩy lùi chẩn đoán nhầm dường như về không.</p>"));

        articles.add(create(id++, "Tin y tế", "/images/articles/tinyte.png", "#0284c7", "fa-earth-americas", "Toà soạn MedCare", "Bản tin Quốc tế",
                "Cấy ghép vi mạch não Neuralink: Tương lai của y học phục hồi",
                "Bệnh nhân bị liệt tứ chi có thể lướt web, điều khiển bàn cờ Vua và dùng cánh tay Robot di chuyển nhờ vào sợi tơ siêu vi kết nối tế bào não.",
                "<p>Startup của tỷ phú Elon Musk công bố báo cáo sơ bộ lâm sàng đầu tiên trên ca phẫu thuật cấy chíp điện cực thâm nhập màng vỏ não thành công rực rỡ. Vi mạch N1 giao tiếp song song với tế bào neuron bằng các điện từ học, khuếch đại tín hiệu suy nghĩ hành động thành mã độc lập chuyển vào cổng máy chủ điều khiển.</p><p>Giới hạn phục hồi chức năng của tủy sống từng là dĩ vãng bi kịch, nay được thắp lên ngọn đèn phục hồi vĩ đại chưa từng có trong cả biên niên sử phẫu thuật vi khóa người tàn phế.</p>"));

        articles.add(create(id++, "Tin y tế", "/images/articles/tinyte.png", "#0284c7", "fa-earth-americas", "Toà soạn MedCare", "Bản tin Quốc tế",
                "Phát hiện kháng thể vô hiệu hóa hơn 90% biến thể virus SAR-COV mới",
                "Cấu trúc Gai quái dị của các lõi ARN Virus tiến hóa đã vướng phải bức tường thành phản công từ nhóm nghiên cứu Đại học Cambridge.",
                "<p>Các nhà nghiên cứu huyết thanh cấu trúc phân tử vừa tìm ra loại Protein cấu tạo hiếm, có khả năng bám bắt móc ngoặc và 'khóa chốt' thụ thể di căn của đa phần các dị hình SAR-COV sinh sôi gần đây.</p><p>Quá trình vô hiệu hóa bao bọc lấy cấu trúc tế bào chủ ngay lập tức trước khi virus cấy ARN của mình vào phân bào. Cột mốc ngoạn mục để các viện lâm sàng triển khai dây chuyền tinh tinh tổng hợp thuốc uống dự phòng bảo hộ diện rộng toàn cầu sớm nhất.</p>"));

        return articles;
    }

    private static Map<String, Object> create(int id, String category, String image, String color, String icon, String author, String role, String title, String desc, String content) {
        Map<String, Object> art = new HashMap<>();
        art.put("id", id);
        art.put("title", title);
        art.put("category", category);
        art.put("image", image);
        art.put("color", color);
        art.put("icon", icon);
        art.put("author", author);
        art.put("role", role);
        art.put("date", "Hôm nay");
        art.put("desc", desc);
        art.put("content", content);
        return art;
    }
}
