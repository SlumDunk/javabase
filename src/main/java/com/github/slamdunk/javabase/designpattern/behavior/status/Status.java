package com.github.slamdunk.javabase.designpattern.behavior.status;

/**
 * the status class
 * 
 * @author liuzhongda
 *
 */
public class Status {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void methodA() {
		System.out.println("execute the A opt!");
	}

	public void methodB() {
		System.out.println("execute the B opt!");
	}
}
