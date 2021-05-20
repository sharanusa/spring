package com.xworkz.commonmod.utilities;

import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MailSenderApp {
	
	public static void main(String[] args) {
		JavaMailSenderImpl mailSenderImpl = new JavaMailSenderImpl();
		mailSenderImpl.setHost("smtp.gmail.com");
		mailSenderImpl.setPort(587);
		mailSenderImpl.setUsername("sharan.xworkz@gmail.com");
		mailSenderImpl.setPassword("");
		
		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable", "true");
		javaMailProperties.put("mail.smtp.auth", "true");
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.put("mail.debug", "true");
		
		mailSenderImpl.setJavaMailProperties(javaMailProperties);
		
		String []bccs = {"ajjuhospet96@gmail.com"};
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("sharan.xworkz@gmail.com");
		message.setTo("sharanusa550@gmail.com");
		message.setCc("manojkumarv39@gmail.com");
		message.setBcc(bccs);
		message.setSubject("Java MailSender");
		message.setText("Hi All \n This is Sharanu \n Stay safe");
		
		mailSenderImpl.send(message);
		
	}

}
