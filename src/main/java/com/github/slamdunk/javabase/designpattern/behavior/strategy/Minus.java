package com.github.slamdunk.javabase.designpattern.behavior.strategy;

import com.github.slamdunk.javabase.designpattern.claz.AbstractCalculator;
import com.github.slamdunk.javabase.designpattern.interfaces.ICalculator;

public class Minus extends AbstractCalculator implements ICalculator {

	public int calculate(String exp) {
		// TODO Auto-generated method stub
		int arrayInt[] = split(exp, "-");
		return arrayInt[0] - arrayInt[1];
	}

}
