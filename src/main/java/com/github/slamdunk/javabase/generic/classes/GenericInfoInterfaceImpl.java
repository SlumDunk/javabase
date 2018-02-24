package com.github.slamdunk.javabase.generic.classes;

import com.github.slamdunk.javabase.generic.interfaces.GenericInfoInterface;

/**
 * a class implements the generic interface whith type of String
 * @author liuzhongda
 *
 */
public class GenericInfoInterfaceImpl implements GenericInfoInterface<String> {

	private String var;

	public GenericInfoInterfaceImpl(String var) {
		super();
		this.setVar(var);
	}

	public String getVar() {
		// TODO Auto-generated method stub
		return this.var;
	}

	public void setVar(String var) {
		this.var = var;
	}

}
