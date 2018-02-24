package com.github.slamdunk.javabase.generic.classes;

/**
 * a generic info class
 * 
 * access permission +class + name of class + <T>
 * 
 * @author liuzhongda
 *
 * @param <T>
 */
public class Info<T> {
	private T var; // define a generic variable

	public void setVar(T var) {
		this.var = var;
	}

	public T getVar() {
		return this.var;
	}

	public String toString() {
		// print directly
		return this.var.toString();
	}
}
