package com.github.slamdunk.javabase.designpattern.creator.factory.singlefactory;

import com.github.slamdunk.javabase.designpattern.claz.MailSender;
import com.github.slamdunk.javabase.designpattern.claz.SmsSender;
import com.github.slamdunk.javabase.designpattern.interfaces.Sender;

/**
 * a factory for creating sender
 * 
 * @author liuzhongda
 *
 */
public class SingleMethodFactory {
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("please input the right type of sender");
			return null;
		}
	}
}
