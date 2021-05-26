package com.xworkz.common.utility;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

@Component
public class Mailsender {

	@Autowired
	JavaMailSenderImpl mailSenderImpl;

	public void sendEmail() {

		String[] bccs = { "ajjuhospet96@gmail.com" };
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("sharan.xworkz@gmail.com");
		message.setTo("sharanusa550@gmail.com");
		message.setCc("manojkumarv39@gmail.com");
		message.setBcc(bccs);
		message.setSubject("Java Mailsender");
		message.setText(" Hello \n This is Sharanu \n stay home stay safe");

		mailSenderImpl.send(message);

	}
}