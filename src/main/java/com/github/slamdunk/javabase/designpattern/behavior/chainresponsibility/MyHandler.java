package com.github.slamdunk.javabase.designpattern.behavior.chainresponsibility;

import com.github.slamdunk.javabase.designpattern.interfaces.Handler;

public class MyHandler extends AbstractHandler implements Handler {
	private String name;

	public void operator() {
		// TODO Auto-generated method stub
		System.out.println(name + "deal!");
		if (getHandler() != null) {
			getHandler().operator();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyHandler(String name) {
		super();
		this.name = name;
	}

}
