package com.github.slamdunk.javabase.designpattern.behavior.visitor;

/**
 * boss role class
 * 
 * @author liuzhongda
 *
 */
public class Boss extends AbstractVisitor {
	private double totalIncome;
	private double totalConsume;

	@Override
	void visitConsumeBill(ConsumeBill bill) {
		// TODO Auto-generated method stub
		totalConsume += bill.getAmount();
	}

	@Override
	void visitIncomeBill(IncomeBill bill) {
		// TODO Auto-generated method stub
		totalIncome += bill.getAmount();
	}

	public double getTotalConsume() {
		System.out.println("the boss check the total consume, the total consume is: " + totalConsume);
		return totalConsume;
	}

	public double getTotalIncome() {
		System.out.println("the boss check the total income, the total income is: " + totalIncome);
		return totalIncome;
	}

}
