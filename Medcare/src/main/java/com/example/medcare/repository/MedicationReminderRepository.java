package com.example.medcare.repository;

import com.example.medcare.model.MedicationReminder;
import com.example.medcare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicationReminderRepository extends JpaRepository<MedicationReminder, Long> {
    List<MedicationReminder> findByUserOrderByReminderTimeAsc(User user);
}
