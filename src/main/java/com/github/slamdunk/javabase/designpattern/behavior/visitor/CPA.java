package com.github.slamdunk.javabase.designpattern.behavior.visitor;

/**
 * the accountant class
 * 
 * @author liuzhongda
 *
 */
public class CPA extends AbstractVisitor {

	@Override
	void visitConsumeBill(ConsumeBill bill) {
		// TODO Auto-generated method stub
		if (bill.getItem().equals("salary")) {
			System.out.println("check the tax revenue of personal salary");
		}
	}

	@Override
	void visitIncomeBill(IncomeBill bill) {
		// TODO Auto-generated method stub
		System.out.println("check the tax revenue of income");
	}

}
