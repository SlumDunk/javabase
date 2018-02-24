package com.github.slamdunk.javabase.designpattern.creator.abstractfactory;

import com.github.slamdunk.javabase.designpattern.claz.SmsSender;
import com.github.slamdunk.javabase.designpattern.interfaces.Provider;
import com.github.slamdunk.javabase.designpattern.interfaces.Sender;

/**
 * a factory which produces sms sender
 * @author liuzhongda
 *
 */
public class SendSmsFactory implements Provider {

	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
