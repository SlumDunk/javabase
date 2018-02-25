package com.github.slamdunk.javabase.designpattern.behavior.visitor;

public abstract class AbstractBill implements Bill {
	private double amount;
	private String item;

	public AbstractBill(double amount, String item) {
		super();
		this.amount = amount;
		this.item = item;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}
