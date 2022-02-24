package com.demo.emailapplication.Service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Controller
public class EmailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendConfirmationMail(String email) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(email);
        helper.setSubject("change password");
        helper.setFrom("denemespringemail@gmail.com");
        helper.setText( "<html><body><p>Sifrenizi yenilemek icin <a href='https://www.amazon.com.tr/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350882'>tiklayiniz</p></body></html>", true);
        javaMailSender.send(message);

    }
    /*
           SimpleMailMessage mailMessage = new SimpleMailMessage();
         mailMessage.setTo(email);
        mailMessage.setSubject("change password");
        mailMessage.setFrom("denemespringemail@gmail.com");
        mailMessage.setText();
             */
}
