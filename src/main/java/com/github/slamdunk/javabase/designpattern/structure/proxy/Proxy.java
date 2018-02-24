package com.github.slamdunk.javabase.designpattern.structure.proxy;

import com.github.slamdunk.javabase.designpattern.claz.SourceableImpl;
import com.github.slamdunk.javabase.designpattern.interfaces.Sourceable;

/**
 * a proxy class
 * 
 * @author liuzhongda
 *
 */
public class Proxy implements Sourceable {
	private SourceableImpl source;

	public Proxy() {
		super();
		this.source = new SourceableImpl();
	}

	public void methodC() {
		// TODO Auto-generated method stub
		before();
		source.methodC();
		after();
	}

	public void methodD() {
		// TODO Auto-generated method stub
		before();
		source.methodD();
		after();
	}

	private void before() {
		// TODO Auto-generated method stub
		System.out.println("before proxy");
	}

	private void after() {
		// TODO Auto-generated method stub
		System.out.println("after proxy");
	}

}
