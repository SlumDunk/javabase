package com.github.slamdunk.javabase.designpattern.behavior.mediator;

public class MyMediator implements Mediator {

	ColleagueA collA;
	ColleagueB collB;

	public ColleagueA getCollA() {
		return collA;
	}

	public void setCollA(ColleagueA collA) {
		this.collA = collA;
	}

	public ColleagueB getCollB() {
		return collB;
	}

	public void setCollB(ColleagueB collB) {
		this.collB = collB;
	}

	public void contact(String content, Colleague coll) {
		// TODO Auto-generated method stub
		if (coll == collA) {
			collB.receiveMessage(content);
		} else {
			collA.receiveMessage(content);
		}
	}

}
