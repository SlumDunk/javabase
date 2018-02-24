package com.github.slamdunk.javabase.designpattern.structure.adapter;
/**
 * the SouceSubC class can be adapted to the interface of Sourceable
 * @author liuzhongda
 *
 */
public class SourceSubC extends InterfaceAdapter {

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		super.methodC();
		System.out.println("the sourceable interface's SubC!");
	}
}
