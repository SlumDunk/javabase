package com.github.slamdunk.javabase.designpattern.behavior.command;

import com.github.slamdunk.javabase.designpattern.interfaces.Command;

public class MyCommand implements Command {
	private Receiver receiver;

	public void exe() {
		// TODO Auto-generated method stub
		receiver.action();
	}

	public MyCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

}
