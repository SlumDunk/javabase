package com.github.slamdunk.javabase.designpattern.interfaces;

/**
 * an interface defined for producing sender
 * @author liuzhongda
 *
 */
public interface Provider {
	/**
	 * produce a sender
	 * 
	 * @return
	 */
	public Sender produce();
}
