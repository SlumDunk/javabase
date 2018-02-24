package com.github.slamdunk.javabase.generic.classes;

import com.github.slamdunk.javabase.generic.interfaces.GenericInfoInterface;

/**
 * another class which implements the generic interface
 * 
 * @author liuzhongda
 *
 * @param <T>
 */
public class AnotherGenericInfoInterfaceImpl<T> implements GenericInfoInterface<T> {

	private T var;

	public AnotherGenericInfoInterfaceImpl(T var) {
		super();
		this.setVar(var);
	}

	public T getVar() {
		// TODO Auto-generated method stub
		return this.var;
	}

	public void setVar(T var) {
		this.var = var;
	}

}
