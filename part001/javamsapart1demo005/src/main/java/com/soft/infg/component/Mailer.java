package com.soft.infg.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class Mailer {

	@Autowired
	private JavaMailSender javaMailService;

	Mailer() {

	}

	public void sendMail(String email) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(email);
		mailMessage.setSubject("Registration");
		mailMessage.setText("Successfully Registered");
		javaMailService.send(mailMessage);
	}

}
