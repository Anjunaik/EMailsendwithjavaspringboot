package com.acoder.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acoder.emilsender.EmailsenderService;
import com.acoder.pojo.Emailproperties;

@RestController
public class MailSenderController {

@Autowired
private EmailsenderService emailsenderService;

@PostMapping(value="/send")
	public String sendMail(@RequestBody Emailproperties emailproperties)
	{
	  boolean mailsender;
	try {
		mailsender = emailsenderService.mailsender(emailproperties);
		if(mailsender)
			  return "G-mail successfully sent....";
	} catch (Exception e) {
		e.printStackTrace();
	}
	  
		return " Failed to send G-mail";
	}
	
}
