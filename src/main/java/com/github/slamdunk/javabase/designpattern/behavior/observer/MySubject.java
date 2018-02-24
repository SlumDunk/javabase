package com.github.slamdunk.javabase.designpattern.behavior.observer;

public class MySubject extends AbstractSubject {

	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("update self!");
		notifyObservers();
	}

}
