package com.github.slamdunk.javabase.designpattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

public class AccountBook {
	private List<Bill> billList = new ArrayList<Bill>();

	/**
	 * add the bill into a collection
	 * 
	 * @param bill
	 */
	public void addBill(Bill bill) {
		billList.add(bill);
	}

	/**
	 * show all the bills for the visitor
	 * 
	 * @param visitor
	 */
	public void show(Visitor visitor) {
		for (Bill bill : billList) {
			bill.accept(visitor);
		}
	}
}
