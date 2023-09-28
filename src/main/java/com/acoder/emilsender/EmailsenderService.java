package com.acoder.emilsender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.acoder.pojo.Emailproperties;


@Service
public class EmailsenderService  {

	@Autowired
	private MailSender mailSender;
	
	public boolean mailsender( Emailproperties emailproperties)
	{
		
	boolean flag= false;
		
	try {
		SimpleMailMessage mailMessage= new SimpleMailMessage();
			mailMessage.setFrom(emailproperties.getFrom());
			mailMessage.setText(emailproperties.getBody());
			mailMessage.setSubject(emailproperties.getSubject());
		    mailMessage.setSentDate(new Date(System.currentTimeMillis()));
		    mailSender.send(mailMessage);
		    flag= true;
	} catch (MailException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    
		return flag;
	}

}
 