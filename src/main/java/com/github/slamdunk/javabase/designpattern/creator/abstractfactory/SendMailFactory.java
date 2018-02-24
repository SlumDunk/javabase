package com.github.slamdunk.javabase.designpattern.creator.abstractfactory;

import com.github.slamdunk.javabase.designpattern.claz.MailSender;
import com.github.slamdunk.javabase.designpattern.interfaces.Provider;
import com.github.slamdunk.javabase.designpattern.interfaces.Sender;

/**
 * a factory which produces mail sender
 * 
 * @author liuzhongda
 *
 */
public class SendMailFactory implements Provider {

	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
