package com.github.slamdunk.javabase.test;

import com.github.slamdunk.javabase.clazscope.ClassA;
import com.github.slamdunk.javabase.clazscope.OuterClass;
import com.github.slamdunk.javabase.clazscope.OuterClass.InnerClassA;
import com.github.slamdunk.javabase.clazscope.OuterClass.StaticInnerClassA;

/**
 * a class for testing the scope of classes
 * 
 * @author liuzhongda
 *
 */
public class ClazScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA classA = new ClassA();
		classA.sayHello();
		// we can access an public embeded inner class
		StaticInnerClassA staticInnerClassA = new StaticInnerClassA();
		System.out.println(staticInnerClassA.cal());
		
		// create an normal class
		OuterClass outerClass = new OuterClass(2, 3);
		// create an member inner class
		InnerClassA innerClassA = outerClass.new InnerClassA();
		System.out.println(innerClassA.cal());
	}

}
