package com.github.slamdunk.javabase.designpattern.behavior.status;

/**
 * the context class
 * 
 * @author liuzhongda
 *
 */
public class Context {
	private Status status;

	public Context(Status status) {
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * execute different nested method according to different status
	 */
	public void method() {
		if (status.getValue().equals("statusA")) {
			status.methodA();
		} else if (status.getValue().equals("statusB")) {
			status.methodB();
		}
	}
}
