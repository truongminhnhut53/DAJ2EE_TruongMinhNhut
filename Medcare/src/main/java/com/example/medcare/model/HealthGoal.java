package com.example.medcare.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "health_goals")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HealthGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    private Double targetWeight; // Mục tiêu cân nặng (kg)
    
    // Có thể mở rộng thêm mục tiêu đi bộ, lượng nước uống sau này...
    private Integer targetWaterMl; 
}
