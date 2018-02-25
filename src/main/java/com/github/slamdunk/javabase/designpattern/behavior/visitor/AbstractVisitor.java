package com.github.slamdunk.javabase.designpattern.behavior.visitor;

public abstract class AbstractVisitor implements Visitor {
	/**
	 * visit consume bill
	 * 
	 * @param bill
	 */
	abstract void visitConsumeBill(ConsumeBill bill);

	/**
	 * visit income bill
	 * 
	 * @param bill
	 */
	abstract void visitIncomeBill(IncomeBill bill);

	public final void visitAbstractSubject(AbstractBill bill) {
		// TODO Auto-generated method stub

	}

}
