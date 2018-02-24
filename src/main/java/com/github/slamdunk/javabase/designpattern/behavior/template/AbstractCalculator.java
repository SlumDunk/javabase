package com.github.slamdunk.javabase.designpattern.behavior.template;

public abstract class AbstractCalculator {
	/**
	 * main method which call other methods
	 * 
	 * @param exp
	 * @param opt
	 * @return
	 */
	public final int calculate(String exp, String opt) {
		int array[] = split(exp, opt);
		return calculate(array[0], array[1]);
	}

	/**
	 * a method customed by nested class
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	abstract public int calculate(int num1, int num2);

	public int[] split(String exp, String opt) {
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}
