package com.example.repository;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findBySubscriptionExpiryDateBetweenAndNotified(LocalDate start, LocalDate end, boolean notified);
}
