package com.github.slamdunk.javabase.designpattern.creator.factory.multifactory;

import com.github.slamdunk.javabase.designpattern.claz.MailSender;
import com.github.slamdunk.javabase.designpattern.claz.SmsSender;
import com.github.slamdunk.javabase.designpattern.interfaces.Sender;

/**
 * a class with multi factory methods,
 * 
 * a factory is defined for create one specific product
 * 
 * @author liuzhongda
 *
 */
public class MultiMethodFactory {

	/**
	 * create a mailSender
	 * 
	 * @return
	 */
	public Sender produceMail() {
		return new MailSender();
	}

	/**
	 * create a smsSender
	 * 
	 * @return
	 */
	public Sender produceSms() {
		return new SmsSender();
	}
}
