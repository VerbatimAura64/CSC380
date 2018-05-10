/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movieprogram.Main;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;
import javax.mail.Transport;
/**
 *
 * @author balfo
 */
public class SendEmail {
    SignUpForm suf = new SignUpForm();
    
    public void SendEmail() {
       
        
        String host = "smtp.gmail.com";
        String sender = "ZeeMoviesProgram@gmail.com";
        String password = "I_Like_Movies";
        String recipient = suf.email;
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sender,password);
            }
        });
        
        
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sender));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            message.setSubject("Welcome to Zee Movies!");
            message.setText("Thanks for joining Zee Movies!");
            
            Transport.send(message);
            System.out.println("Email succesfully sent!");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
