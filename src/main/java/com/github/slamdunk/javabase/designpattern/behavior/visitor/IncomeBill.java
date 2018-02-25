package com.github.slamdunk.javabase.designpattern.behavior.visitor;

/**
 * the bill of income
 * 
 * @author liuzhongda
 *
 */
public class IncomeBill extends AbstractBill {

	public IncomeBill(double amount, String item) {
		super(amount, item);
		// TODO Auto-generated constructor stub
	}

	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		if (visitor instanceof AbstractVisitor) {
			((AbstractVisitor) visitor).visitIncomeBill(this);
			return;
		}
		visitor.visitAbstractSubject(this);
	}

}
