package com.example.medcare.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Entity
@Table(name = "medication_reminders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedicationReminder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @org.hibernate.annotations.Nationalized
    @Column(nullable = false)
    private String medicationName; // Tên thuốc/TPCN
    
    @Column(nullable = false)
    private LocalTime reminderTime; // Giờ uống (vd: 08:00 AM)

    private Integer durationDays; // Số ngày uống (vd: 15 ngày). Để trống là uống liên tục
    
    @Builder.Default
    private Boolean isActive = true; // Bật tắt nhắc nhở
}
