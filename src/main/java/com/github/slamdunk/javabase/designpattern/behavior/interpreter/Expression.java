package com.github.slamdunk.javabase.designpattern.behavior.interpreter;

/**
 * the interpretion interface
 * 
 * @author liuzhongda
 *
 */
public interface Expression {
	int interpret(Context context);
}
