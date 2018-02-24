package com.github.slamdunk.javabase.designpattern.creator.factory.staticfactory;

import com.github.slamdunk.javabase.designpattern.claz.LightSender;
import com.github.slamdunk.javabase.designpattern.claz.MailSender;
import com.github.slamdunk.javabase.designpattern.claz.SmsSender;
import com.github.slamdunk.javabase.designpattern.interfaces.Sender;

public class StaticFactory {
	/**
	 * create mail sender
	 * @return
	 */
	public static Sender produceMail() {
		return new MailSender();
	}
	
	/**
	 * create sms sender
	 * @return
	 */
	public static Sender produceSms() {
		return new SmsSender();
	}
	
	/**
	 * create light sender
	 * @return
	 */
	public static Sender produceLight() {
		return new LightSender();
	}
}
