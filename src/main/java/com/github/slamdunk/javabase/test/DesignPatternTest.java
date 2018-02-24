package com.github.slamdunk.javabase.test;

import com.github.slamdunk.javabase.designpattern.claz.Source;
import com.github.slamdunk.javabase.designpattern.claz.SourceSub1;
import com.github.slamdunk.javabase.designpattern.claz.SourceSub2;
import com.github.slamdunk.javabase.designpattern.claz.SourceableImpl;
import com.github.slamdunk.javabase.designpattern.creator.abstractfactory.SendMailFactory;
import com.github.slamdunk.javabase.designpattern.creator.abstractfactory.SendSmsFactory;
import com.github.slamdunk.javabase.designpattern.creator.builder.Builder;
import com.github.slamdunk.javabase.designpattern.creator.factory.multifactory.MultiMethodFactory;
import com.github.slamdunk.javabase.designpattern.creator.factory.singlefactory.SingleMethodFactory;
import com.github.slamdunk.javabase.designpattern.creator.factory.staticfactory.StaticFactory;
import com.github.slamdunk.javabase.designpattern.interfaces.Provider;
import com.github.slamdunk.javabase.designpattern.interfaces.Sender;
import com.github.slamdunk.javabase.designpattern.interfaces.Sourceable;
import com.github.slamdunk.javabase.designpattern.interfaces.Targetable;
import com.github.slamdunk.javabase.designpattern.structure.adapter.ClassAdapter;
import com.github.slamdunk.javabase.designpattern.structure.adapter.ObjectWrapper;
import com.github.slamdunk.javabase.designpattern.structure.adapter.SourceSubC;
import com.github.slamdunk.javabase.designpattern.structure.adapter.SourceSubD;
import com.github.slamdunk.javabase.designpattern.structure.bridge.Bridge;
import com.github.slamdunk.javabase.designpattern.structure.composite.Tree;
import com.github.slamdunk.javabase.designpattern.structure.composite.TreeNode;
import com.github.slamdunk.javabase.designpattern.structure.decorator.Decorator;
import com.github.slamdunk.javabase.designpattern.structure.facade.Computer;
import com.github.slamdunk.javabase.designpattern.structure.proxy.Proxy;
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

	public static class ClassAdapterTest {
		Targetable target = new ClassAdapter();

		public void methodA() {
			target.methodA();
		}

		public void methodB() {
			target.methodB();
		}
	}

	public static class ObjAdapterTest {
		Source source = new Source();
		Targetable target = new ObjectWrapper(source);

		public void methodA() {
			target.methodA();
		}

		public void methodB() {
			target.methodB();
		}
	}

	public static class InterfaceAdapterTest {
		Sourceable source = null;

		public void methodC() {
			source = new SourceSubC();
			source.methodC();
		}

		public void methodD() {
			source = new SourceSubD();
			source.methodD();
		}
	}

	public static class DecoratorTest {
		Sourceable orig = new SourceableImpl();
		Sourceable obj = new Decorator(orig);

		public void methodC() {
			obj.methodC();
		}

		public void methodD() {
			obj.methodD();
		}
	}

	public static class ProxyTest {
		Sourceable source = new Proxy();

		public void methodC() {
			source.methodC();
		}

		public void methodD() {
			source.methodD();
		}
	}

	public static class FacadeTest {
		Computer computer = new Computer();

		public void startComputer() {
			computer.startup();
		}

		public void shutdownComputer() {
			computer.shutdown();
		}
	}

	public static class BridgeTest {
		Bridge bridge = new Bridge();

		public void bridgeSub1() {
			bridge.setSource(new SourceSub1());
			bridge.methodC();
			bridge.methodD();
		}

		public void bridgeSub2() {
			bridge.setSource(new SourceSub2());
			bridge.methodC();
			bridge.methodD();
		}
	}

	public static class CompositeTest {

		public void createTree() {
			Tree tree = new Tree("A");
			TreeNode nodeB = new TreeNode("B");
			TreeNode nodeC = new TreeNode("C");

			nodeB.add(nodeC);
			tree.root.add(nodeB);
			System.out.println("build the tree finished!");
		}

	}
}
