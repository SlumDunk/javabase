package com.github.slamdunk.javabase.designpattern.structure.facade;

/**
 * represents the disk in a computer
 * 
 * @author liuzhongda
 *
 */
public class Disk {
	public void startup() {
		System.out.println("disk startup!");
	}

	public void shutdown() {
		System.out.println("disk shutdown!");
	}
}
