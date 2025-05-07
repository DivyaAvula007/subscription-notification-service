package com.example.scheduler;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SubscriptionNotificationScheduler {

    @Autowired
    private UserService userService;

    @Scheduled(cron = "0 * * * * *")  // Runs every minute
    public void notifyExpiringUsers() {
        List<User> expiringUsers = userService.getUsersExpiringSoon();
        for (User user : expiringUsers) {
            System.out.println("Notify User: " + user.getEmail() + " → Your subscription is expiring soon!");
            userService.markUserAsNotified(user);
        }
    }
}

