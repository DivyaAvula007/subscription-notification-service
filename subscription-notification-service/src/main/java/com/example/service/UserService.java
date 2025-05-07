package com.example.service;

import com.example.dto.UserRequest;
import com.example.exception.UserNotFoundException;
import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setSubscriptionExpiryDate(userRequest.getSubscriptionExpiryDate());
        user.setNotified(false);
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id " + id));
    }

    public List<User> getUsersExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusDays(7);
        return userRepository.findBySubscriptionExpiryDateBetweenAndNotified(today, nextWeek, false);
    }

    public void markUserAsNotified(User user) {
        user.setNotified(true);
        userRepository.save(user);
    }
}

