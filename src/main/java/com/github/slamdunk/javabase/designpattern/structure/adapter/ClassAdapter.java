package com.github.slamdunk.javabase.designpattern.structure.adapter;

import com.github.slamdunk.javabase.designpattern.claz.Source;
import com.github.slamdunk.javabase.designpattern.interfaces.Targetable;

/**
 * a adapter class which adapt the original class to the target interface
 * 
 * @author liuzhongda
 *
 */
public class ClassAdapter extends Source implements Targetable {

	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method! ");
	}

}
