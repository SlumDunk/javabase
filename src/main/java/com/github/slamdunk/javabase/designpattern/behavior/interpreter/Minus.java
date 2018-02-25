package com.github.slamdunk.javabase.designpattern.behavior.interpreter;

/**
 * interpret the minus
 * 
 * @author liuzhongda
 *
 */
public class Minus implements Expression {

	public int interpret(Context context) {
		// TODO Auto-generated method stub
		return context.getNum1() - context.getNum2();
	}

}
