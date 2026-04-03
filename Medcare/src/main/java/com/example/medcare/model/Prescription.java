package com.example.medcare.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "prescriptions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String imageUrl; // URL ảnh chụp toa thuốc
    
    @Column(length = 1000)
    @org.hibernate.annotations.Nationalized
    private String notes; // Bệnh nhân ghi chú thêm

    private LocalDateTime uploadedAt; // Thời gian gửi

    @org.hibernate.annotations.Nationalized
    @Builder.Default
    private String status = "CHỜ DUYỆT"; // CHỜ DUYỆT, ĐÃ TƯ VẤN, HOÀN THÀNH
    
    @Column(length = 2000)
    @org.hibernate.annotations.Nationalized
    private String adminReply; // Lời khuyên của bác sĩ, tư vấn sản phẩm
}
