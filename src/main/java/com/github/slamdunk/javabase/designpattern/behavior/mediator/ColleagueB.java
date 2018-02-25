package com.github.slamdunk.javabase.designpattern.behavior.mediator;

public class ColleagueB extends Colleague {
	public ColleagueB(String name, Mediator mediator) {
		super(name, mediator);
	}

	/**
	 * receive message from others
	 * 
	 * @param message
	 */
	public void receiveMessage(String message) {
		System.out.println("colleague B: " + name + " receive message: " + message);
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
