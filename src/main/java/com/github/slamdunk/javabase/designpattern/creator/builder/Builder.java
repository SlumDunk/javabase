package com.github.slamdunk.javabase.designpattern.creator.builder;

import java.util.ArrayList;
import java.util.List;

import com.github.slamdunk.javabase.designpattern.claz.MailSender;
import com.github.slamdunk.javabase.designpattern.claz.SmsSender;
import com.github.slamdunk.javabase.designpattern.interfaces.Sender;

/**
 * a builder class is defined for creating a series of products
 * 
 * @author liuzhongda
 *
 */
public class Builder {
	
	private List<Sender> list = new ArrayList<Sender>();

	public void produceMailSenders(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public void produceSmsSenders(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}
