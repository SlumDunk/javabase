package com.github.slamdunk.javabase.generic.classes;

/**
 * a generic class which restricts upper limit of the generic type
 * 
 * @author liuzhongda
 *
 * @param <T>
 */
public class UpperInfo<T extends Number> {
	private T var; // define a generic variable

	public void setVar(T var) {
		this.var = var;
	}

	public String toString() {
		// print directly
		return this.var.toString();
	}
}
