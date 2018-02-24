package com.github.slamdunk.javabase.designpattern.behavior.observer;

import java.util.Enumeration;
import java.util.Vector;

import com.github.slamdunk.javabase.designpattern.interfaces.Observer;
import com.github.slamdunk.javabase.designpattern.interfaces.Subject;

public abstract class AbstractSubject implements Subject {
	private Vector<Observer> vector = new Vector<Observer>();

	public void add(Observer observer) {
		// TODO Auto-generated method stub
		vector.add(observer);
	}

	public void del(Observer observer) {
		// TODO Auto-generated method stub
		vector.remove(observer);
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		Enumeration<Observer> enumo = vector.elements();
		while (enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}

}
