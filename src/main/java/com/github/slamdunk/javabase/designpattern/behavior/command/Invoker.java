package com.github.slamdunk.javabase.designpattern.behavior.command;

import com.github.slamdunk.javabase.designpattern.interfaces.Command;

public class Invoker {
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	/**
	 * invoke an action
	 */
	public void action() {
		command.exe();
	}
}
