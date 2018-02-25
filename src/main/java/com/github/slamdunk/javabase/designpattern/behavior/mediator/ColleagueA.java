package com.github.slamdunk.javabase.designpattern.behavior.mediator;

public class ColleagueA extends Colleague {

	public ColleagueA(String name, Mediator mediator) {
		super(name, mediator);
		// TODO Auto-generated constructor stub
	}

	/**
	 * receive message from others
	 * 
	 * @param message
	 */
	public void receiveMessage(String message) {
		System.out.println("colleague A:" + name + "get message:" + message);
	}

	/**
	 * contact with mediator
	 * 
	 * @param message
	 */
	public void contact(String message) {
		mediator.contact(message, this);
	}

}
