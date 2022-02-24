package com.demo.emailapplication;

import com.demo.emailapplication.Service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import javax.mail.MessagingException;

@SpringBootApplication
public class EmailApplication{

    public static void main(String[] args) {
        SpringApplication.run(EmailApplication.class, args);
    }

}
