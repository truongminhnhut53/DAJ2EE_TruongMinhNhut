package com.example.medcare.repository;

import com.example.medcare.model.Prescription;
import com.example.medcare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
    List<Prescription> findByUserOrderByUploadedAtDesc(User user);
}
