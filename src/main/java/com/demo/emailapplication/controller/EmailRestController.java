package com.demo.emailapplication.controller;

import com.demo.emailapplication.Service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class EmailRestController {

    @Autowired
    private EmailSenderService emailSenderService;

    @GetMapping("/sendMessage")
    public void sendMessage(@RequestParam String email) throws MessagingException {
        emailSenderService.sendConfirmationMail(email);
    }

}
