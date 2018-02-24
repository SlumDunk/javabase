package com.github.slamdunk.javabase.clazscope;

import com.github.slamdunk.javabase.clazscope.OuterClass.InnerClassB;
import com.github.slamdunk.javabase.clazscope.OuterClass.StaticInnerClassB;

/**
 * define ClassA, ClassB, ClassC in a java file, but only one public class be
 * allowed
 * 
 * @author liuzhongda
 *
 */
public class ClassA {
	/**
	 * a method defined for print a string
	 */
	public void sayHello() {
		System.out.println("hello, guys, begin-------");

		// we can access an public embeded inner class
		StaticInnerClassB staticInnerClassB = new StaticInnerClassB();
		System.out.println(staticInnerClassB.cal());

		// create an normal class
		OuterClass outerClass = new OuterClass(5, 6);
		// create an member inner class
		InnerClassB innerClassA = outerClass.new InnerClassB();
		System.out.println(innerClassA.cal());
		System.out.println("hello, guys, end----------");

	}
}

/**
 * ClassB, can be called in the same package
 * 
 * @author liuzhongda
 *
 */
class ClassB {

}

/**
 * ClassC, can be called in the same package
 * 
 * @author liuzhongda
 *
 */
class ClassC {

}