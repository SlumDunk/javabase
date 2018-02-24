package com.github.slamdunk.javabase.designpattern.structure.adapter;

/**
 * the SouceSubD class can be adapted to the interface of Sourceable
 * 
 * @author liuzhongda
 *
 */
public class SourceSubD extends InterfaceAdapter {

	@Override
	public void methodD() {
		// TODO Auto-generated method stub
		super.methodD();
		System.out.println("the sourceable interface's SubD!");
	}

}
