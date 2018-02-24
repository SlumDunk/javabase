package com.github.slamdunk.javabase.designpattern.structure.facade;

/**
 * represents the cpu in a computer
 * 
 * @author liuzhongda
 *
 */
public class CPU {
	public void startup() {
		System.out.println("cpu startup!");
	}

	public void shutdown() {
		System.out.println("cpu shutdown!");
	}
}
