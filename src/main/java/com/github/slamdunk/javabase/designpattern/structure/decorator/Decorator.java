package com.github.slamdunk.javabase.designpattern.structure.decorator;

import com.github.slamdunk.javabase.designpattern.interfaces.Sourceable;

/**
 * a class which can decorates the methods in the original instance
 * 
 * @author liuzhongda
 *
 */
public class Decorator implements Sourceable {
	private Sourceable original;

	public Decorator(Sourceable orig) {
		this.original = orig;
	}

	public void methodC() {
		// TODO Auto-generated method stub
		System.out.println("before decorator");
		original.methodC();
		System.out.println("after decorator");
	}

	public void methodD() {
		// TODO Auto-generated method stub
		System.out.println("before decorator");
		original.methodD();
		System.out.println("after decorator");
	}

}
