package com.example.demo.controller;

import com.example.demo.feignClient.INotification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    private final INotification notification;

    public NotificationController(INotification notification) {
        this.notification = notification;
    }

    @GetMapping("/notification")
    public String notificationService() {
        return notification.getDetails() + " ask student details";
    }
}