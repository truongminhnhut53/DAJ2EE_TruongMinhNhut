package com.example.medcare.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "health_record")
public class HealthRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double heartRate;
    private double height;
    private double weight;
    private double bmi;
    private LocalDate date;
    @org.hibernate.annotations.Nationalized
    @Column(columnDefinition = "nvarchar(255)")
    private String status;

    private Integer bloodPressureSys; // Huyết áp tâm thu
    private Integer bloodPressureDia; // Huyết áp tâm trương
    
    @Column(length = 500)
    @org.hibernate.annotations.Nationalized
    private String notes; // Ghi chú

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // getter setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Double heartRate) {
        this.heartRate = heartRate;
    }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public double getBmi() { return bmi; }
    public void setBmi(double bmi) { this.bmi = bmi; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Integer getBloodPressureSys() { return bloodPressureSys; }
    public void setBloodPressureSys(Integer bloodPressureSys) { this.bloodPressureSys = bloodPressureSys; }

    public Integer getBloodPressureDia() { return bloodPressureDia; }
    public void setBloodPressureDia(Integer bloodPressureDia) { this.bloodPressureDia = bloodPressureDia; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}