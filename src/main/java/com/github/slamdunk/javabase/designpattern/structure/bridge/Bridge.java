package com.github.slamdunk.javabase.designpattern.structure.bridge;

import com.github.slamdunk.javabase.designpattern.interfaces.Sourceable;

/**
 * a class which can bridge different implementations of interface
 * @author liuzhongda
 *
 */
public class Bridge {
	private Sourceable source;

	public void methodC() {
		source.methodC();
	}

	public void methodD() {
		source.methodD();
	}

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}
}
