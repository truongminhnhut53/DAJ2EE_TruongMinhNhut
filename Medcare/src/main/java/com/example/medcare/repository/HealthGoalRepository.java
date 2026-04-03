package com.example.medcare.repository;

import com.example.medcare.model.HealthGoal;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface HealthGoalRepository extends JpaRepository<HealthGoal, Long> {
    Optional<HealthGoal> findByUserUsername(String username);
}
