package com.github.slamdunk.javabase.designpattern.claz;

/**
 * a helper class
 * 
 * @author liuzhongda
 *
 */
public abstract class AbstractCalculator {
	/**
	 * split the input string and get the array of num
	 * 
	 * @param exp
	 * @param opt
	 * @return
	 */
	public int[] split(String exp, String opt) {
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}
