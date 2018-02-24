package com.github.slamdunk.javabase.test;

import com.github.slamdunk.javabase.designpattern.creator.abstractfactory.SendMailFactory;
import com.github.slamdunk.javabase.designpattern.creator.abstractfactory.SendSmsFactory;
import com.github.slamdunk.javabase.designpattern.creator.builder.Builder;
import com.github.slamdunk.javabase.designpattern.creator.factory.multifactory.MultiMethodFactory;
import com.github.slamdunk.javabase.designpattern.creator.factory.singlefactory.SingleMethodFactory;
import com.github.slamdunk.javabase.designpattern.creator.factory.staticfactory.StaticFactory;
import com.github.slamdunk.javabase.designpattern.interfaces.Provider;
import com.github.slamdunk.javabase.designpattern.interfaces.Sender;
import com.github.slamdunk.javabase.designpattern.creator.singleton.Singleton;

public class DesignPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test factory pattern
		FactoryTest factoryTest = new FactoryTest();
		factoryTest.sendSms();
		factoryTest.sendMail();
		factoryTest.sendLight();

		// test abstract factory pattern
		AbstractFactoryTest abstractFactoryTest = new AbstractFactoryTest();
		abstractFactoryTest.sendMail();
		abstractFactoryTest.sendSms();

		// test singleton pattern
		SingletonTest singleTest = new SingletonTest();
		singleTest.single();
	}

	public static class FactoryTest {

		public void sendSms() {
			SingleMethodFactory factory = new SingleMethodFactory();
			Sender sender = factory.produce("sms");
			sender.send();
		}

		public void sendMail() {
			MultiMethodFactory factory = new MultiMethodFactory();
			Sender sender = factory.produceMail();
			sender.send();
		}

		public void sendLight() {
			StaticFactory.produceLight().send();
		}
	}

	public static class AbstractFactoryTest {
		Provider provider = null;

		public void sendSms() {
			provider = new SendSmsFactory();
			Sender sender = provider.produce();
			sender.send();
		}

		public void sendMail() {
			provider = new SendMailFactory();
			Sender sender = provider.produce();
			sender.send();
		}
	}

	public static class SingletonTest {

		public void single() {
			Singleton.getInstance().sayHello();
		}
	}

	public static class BuilderTest {

		public void createMailSenders() {
			Builder builder = new Builder();
			builder.produceMailSenders(10);
		}
	}
}
