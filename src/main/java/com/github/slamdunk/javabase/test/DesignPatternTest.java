package com.github.slamdunk.javabase.test;

import com.github.slamdunk.javabase.designpattern.behavior.strategy.Plus;
import com.github.slamdunk.javabase.designpattern.behavior.template.AbstractCalculator;
import com.github.slamdunk.javabase.designpattern.behavior.visitor.AccountBook;
import com.github.slamdunk.javabase.designpattern.behavior.visitor.Boss;
import com.github.slamdunk.javabase.designpattern.behavior.visitor.CFO;
import com.github.slamdunk.javabase.designpattern.behavior.visitor.CPA;
import com.github.slamdunk.javabase.designpattern.behavior.visitor.ConsumeBill;
import com.github.slamdunk.javabase.designpattern.behavior.visitor.IncomeBill;
import com.github.slamdunk.javabase.designpattern.behavior.visitor.Visitor;
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
import com.github.slamdunk.javabase.designpattern.interfaces.Collection;
import com.github.slamdunk.javabase.designpattern.interfaces.Command;
import com.github.slamdunk.javabase.designpattern.interfaces.ICalculator;
import com.github.slamdunk.javabase.designpattern.interfaces.Iterator;
import com.github.slamdunk.javabase.designpattern.interfaces.Provider;
import com.github.slamdunk.javabase.designpattern.interfaces.Sender;
import com.github.slamdunk.javabase.designpattern.interfaces.Sourceable;
import com.github.slamdunk.javabase.designpattern.interfaces.Subject;
import com.github.slamdunk.javabase.designpattern.interfaces.Targetable;
import com.github.slamdunk.javabase.designpattern.behavior.chainresponsibility.MyHandler;
import com.github.slamdunk.javabase.designpattern.behavior.command.Invoker;
import com.github.slamdunk.javabase.designpattern.behavior.command.MyCommand;
import com.github.slamdunk.javabase.designpattern.behavior.command.Receiver;
import com.github.slamdunk.javabase.designpattern.behavior.interpreter.Minus;
import com.github.slamdunk.javabase.designpattern.behavior.iterator.MyCollection;
import com.github.slamdunk.javabase.designpattern.behavior.mediator.ColleagueA;
import com.github.slamdunk.javabase.designpattern.behavior.mediator.ColleagueB;
import com.github.slamdunk.javabase.designpattern.behavior.mediator.MyMediator;
import com.github.slamdunk.javabase.designpattern.behavior.menento.Original;
import com.github.slamdunk.javabase.designpattern.behavior.menento.Storage;
import com.github.slamdunk.javabase.designpattern.behavior.observer.MySubject;
import com.github.slamdunk.javabase.designpattern.behavior.observer.ObserverA;
import com.github.slamdunk.javabase.designpattern.behavior.observer.ObserverB;
import com.github.slamdunk.javabase.designpattern.behavior.status.Context;
import com.github.slamdunk.javabase.designpattern.behavior.status.Status;
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

	/**
	 * test factory pattern
	 * 
	 * @author liuzhongda
	 *
	 */
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

	/**
	 * test abstract factory pattern
	 * 
	 * @author liuzhongda
	 *
	 */
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

	/**
	 * test singleton pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class SingletonTest {

		public void single() {
			Singleton.getInstance().sayHello();
		}
	}

	/**
	 * test builder pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class BuilderTest {

		public void createMailSenders() {
			Builder builder = new Builder();
			builder.produceMailSenders(10);
		}
	}

	/**
	 * test adapter pattern about different class
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class ClassAdapterTest {
		Targetable target = new ClassAdapter();

		public void methodA() {
			target.methodA();
		}

		public void methodB() {
			target.methodB();
		}
	}

	/**
	 * test adapter pattern about different obj
	 * 
	 * @author liuzhongda
	 *
	 */
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

	/**
	 * test adapter pattern about different interfaces
	 * 
	 * @author liuzhongda
	 *
	 */
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

	/**
	 * test decorator pattern
	 * 
	 * @author liuzhongda
	 *
	 */
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

	/**
	 * test proxy pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class ProxyTest {
		Sourceable source = new Proxy();

		public void methodC() {
			source.methodC();
		}

		public void methodD() {
			source.methodD();
		}
	}

	/**
	 * test facade pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class FacadeTest {
		Computer computer = new Computer();

		public void startComputer() {
			computer.startup();
		}

		public void shutdownComputer() {
			computer.shutdown();
		}
	}

	/**
	 * test bridge pattern
	 * 
	 * @author liuzhongda
	 *
	 */
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

	/**
	 * test conposite pattern
	 * 
	 * @author liuzhongda
	 *
	 */
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

	/**
	 * test strategy pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class StrategyTest {

		public void calculate() {
			String exp = "2+8";
			ICalculator cal = new Plus();
			int result = cal.calculate(exp);
			System.out.println(result);
		}

	}

	/**
	 * test template pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class TemplateTest {

		public void calculate() {
			String exp = "2+8";
			AbstractCalculator cal = new com.github.slamdunk.javabase.designpattern.behavior.template.Plus();
			int result = cal.calculate(exp, "\\+");
			System.out.println(result);
		}

	}

	/**
	 * test observer pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class ObserverTest {

		public void trigger() {
			Subject sub = new MySubject();
			sub.add(new ObserverA());
			sub.add(new ObserverB());
			sub.operation();
		}

	}

	/**
	 * test iterator pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class IteratorTest {

		public void iterate() {
			String[] arrayStr = { "abc", "123", "helloworld" };
			Collection<String> collection = new MyCollection<String>(arrayStr);
			Iterator<String> iterator = collection.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}

	}

	/**
	 * test chain responsibility pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class ChainResponsibilityTest {

		public void chainHandle() {
			MyHandler h1 = new MyHandler("h1");
			MyHandler h2 = new MyHandler("h2");
			MyHandler h3 = new MyHandler("h3");

			h1.setHandler(h2);
			h2.setHandler(h3);

			h1.operator();
		}

	}

	/**
	 * test command pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class CommandTest {

		public void sendCmd() {
			Receiver receiver = new Receiver();
			Command cmd = new MyCommand(receiver);
			Invoker invoker = new Invoker(cmd);
			invoker.action();
		}

	}

	/**
	 * test memento pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class MementoTest {

		public void reboundStatus() {
			Original origi = new Original("egg");

			Storage storage = new Storage(origi.createMemento());

			System.out.println("the initial status is: " + origi.getValue());
			origi.setValue("pig");
			System.out.println("the status after updating is: " + origi.getValue());

			origi.resetStatus(storage.getMemento());

			System.out.println("the status after reseting is: " + origi.getValue());
		}

	}

	/**
	 * test status pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class StatusTest {

		public void testStatus() {
			Status status = new Status();
			Context context = new Context(status);
			// set the first status
			status.setValue("statusA");
			context.method();
			// set another status
			status.setValue("statusB");
			context.method();
		}

	}

	/**
	 * test visitor pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class VisitorTest {

		public void testVisitor() {
			AccountBook accountBook = new AccountBook();
			// add two income bills
			accountBook.addBill(new IncomeBill(10000, "sell goods"));
			accountBook.addBill(new IncomeBill(12000, "sell postion of ad"));
			// add two consume bills
			accountBook.addBill(new ConsumeBill(1000, "salary"));
			accountBook.addBill(new ConsumeBill(2000, "fee of material"));

			Visitor boss = new Boss();
			Visitor cpa = new CPA();
			Visitor cfo = new CFO();

			// 两个访问者分别访问账本
			accountBook.show(cpa);
			accountBook.show(boss);
			accountBook.show(cfo);

			((Boss) boss).getTotalConsume();
			((Boss) boss).getTotalIncome();
		}

	}

	/**
	 * test mediator pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class MediatorTest {

		public void testMediator() {
			// define my mediator
			MyMediator mediator = new MyMediator();
			// define colleague instances
			ColleagueA colleagueA = new ColleagueA("zhangsan", mediator);
			ColleagueB colleagueB = new ColleagueB("lisi", mediator);
			// mediator knows each colleague
			mediator.setCollA(colleagueA);
			mediator.setCollB(colleagueB);
			// communicate via mediator
			colleagueA.contact("I'm A，I want to communicate with B about some business");
			colleagueB.contact("I'm B, I have time this afternoon, let's meet at that time");
		}

	}

	/**
	 * test interpret pattern
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class InterpretTest {

		public void testInterpret() {
			int result = new Minus()
					.interpret(new com.github.slamdunk.javabase.designpattern.behavior.interpreter.Context(
							new com.github.slamdunk.javabase.designpattern.behavior.interpreter.Plus().interpret(
									new com.github.slamdunk.javabase.designpattern.behavior.interpreter.Context(9, 2)),
							4));
			System.out.println(result);
		}

	}
}
