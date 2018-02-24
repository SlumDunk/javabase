package com.github.slamdunk.javabase.designpattern.structure.adapter;

import com.github.slamdunk.javabase.designpattern.claz.Source;
import com.github.slamdunk.javabase.designpattern.interfaces.Targetable;

/**
 * a adapter class which adapt the original instance to the target interface
 * 
 * @author liuzhongda
 *
 */
public class ObjectWrapper implements Targetable {

	private Source source;

	public ObjectWrapper(Source source) {
		super();
		this.source = source;
	}

	public void methodA() {
		// TODO Auto-generated method stub

	}

	public void methodB() {
		// TODO Auto-generated method stub

	}

}
