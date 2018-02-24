package com.github.slamdunk.javabase.test;

import java.lang.reflect.Method;

import com.github.slamdunk.javabase.anotations.MyAnotation;

/**
 * a class for testing my customed anotation
 * 
 * @author liuzhongda
 *
 */
public class AnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// load the Child class
			Class<?> c = Class.forName("com.github.slamdunk.javabase.anotations.classes.Child");
			// get all the mothods of class c
			Method[] ms = c.getMethods();
			// iterate all the methods in the array
			for (Method m : ms) {
				boolean isExist = m.isAnnotationPresent(MyAnotation.class);
				if (isExist) {
					MyAnotation myAnotation = m.getAnnotation(MyAnotation.class);
					System.out.println(myAnotation.valueStr());
					System.out.println(myAnotation.valueEnum());
					System.out.println(myAnotation.valueArray());
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
