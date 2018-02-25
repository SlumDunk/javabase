package com.github.slamdunk.javabase.designpattern.behavior.visitor;

/**
 * the chief financial officier class
 * 
 * @author liuzhongda
 *
 */
public class CFO implements Visitor {

	public void visitAbstractSubject(AbstractBill bill) {
		// TODO Auto-generated method stub
		System.out.println("the CFO check each item in the account book, the name of item is " + bill.getItem()
				+ " the amount is " + bill.getAmount());
	}

}
