package com.github.slamdunk.javabase.designpattern.behavior.visitor;

/**
 * the bill of consuming
 * 
 * @author liuzhongda
 *
 */
public class ConsumeBill extends AbstractBill {

	public ConsumeBill(double amount, String item) {
		super(amount, item);
		// TODO Auto-generated constructor stub
	}

	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		if (visitor instanceof AbstractVisitor) {
			((AbstractVisitor) visitor).visitConsumeBill(this);
			return;
		}
		visitor.visitAbstractSubject(this);
	}

}
