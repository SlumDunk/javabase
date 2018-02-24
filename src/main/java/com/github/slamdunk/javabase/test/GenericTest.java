package com.github.slamdunk.javabase.test;

import com.github.slamdunk.javabase.generic.classes.AnotherGenericInfoInterfaceImpl;
import com.github.slamdunk.javabase.generic.classes.Container;
import com.github.slamdunk.javabase.generic.classes.ContainerInfo;
import com.github.slamdunk.javabase.generic.classes.GenericInfoInterfaceImpl;
import com.github.slamdunk.javabase.generic.classes.Info;
import com.github.slamdunk.javabase.generic.classes.UpperInfo;
import com.github.slamdunk.javabase.generic.interfaces.GenericInfoInterface;

/**
 * a class for testing the function of generic classes, interfaces, methods
 * 
 * @author liuzhongda
 *
 */
public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// test generic classes
		Info<String> infoStr = new Info<String>();
		infoStr.setVar("helloworld");
		fun(infoStr);

		Info<Integer> infoInt = new Info<Integer>();
		Info<Float> infoFloat = new Info<Float>();
		infoInt.setVar(30);
		infoFloat.setVar(30.1F);
		upperLimitFun(infoInt);
		upperLimitFun(infoFloat);

		// test the scope limit of generic class
		UpperInfo<Integer> upperInfoInt = new UpperInfo<Integer>();
		upperInfoInt.setVar(100);
		fun(upperInfoInt);

		Info<Object> infoObj = new Info<Object>();
		infoObj.setVar(new Object());
		lowerLimitFun(infoStr);
		lowerLimitFun(infoObj);

		// test generic interface
		GenericInfoInterface<?> genericInterface = null;
		genericInterface = new GenericInfoInterfaceImpl("cowboy");
		System.out.println("the content of genericInterface is " + genericInterface.getVar());

		GenericInfoInterface<String> genericInterfaceStr = null;
		genericInterfaceStr = new AnotherGenericInfoInterfaceImpl<String>("sunshine girl");
		System.out.println("the content of genericInterfaceStr is " + genericInterfaceStr.getVar());

		// test the generic methods
		System.out.println(fun(200));

		Integer intArray[] = funArray(1, 2, 3, 4, 5, 6);

		System.out.println("the intArray is " + intArray.toString());

		// test the nest of generic class
		Container<ContainerInfo<String, Integer>> container = null;
		ContainerInfo<String, Integer> containerInfo = new ContainerInfo<String, Integer>("Doug", 25);
		container = new Container<ContainerInfo<String, Integer>>(containerInfo);
		System.out.println("var=" + container.getInfo().getVar() + " value=" + container.getInfo().getValue());
	}

	/**
	 * a method used for printing the content of param
	 * 
	 * @param param
	 */
	public static void fun(Info<?> param) {
		System.out.println("the content is " + param);
	}

	/**
	 * a method used for printing the content of param
	 * 
	 * @param param
	 */
	public static void fun(UpperInfo<?> param) {
		System.out.println("the content is " + param);
	}

	/**
	 * 
	 * @param param
	 *            the param must generate from the class of Number
	 */
	public static void upperLimitFun(Info<? extends Number> param) {
		System.out.println("the content is " + param);
	}

	/**
	 * 
	 * @param param
	 *            the type of param should be String or Object
	 */
	public static void lowerLimitFun(Info<? super String> param) {
		System.out.println("the content is " + param);
	}

	/**
	 * a generic method
	 * 
	 * access permission+ <T> + return type + name of method + (T name of parameter)
	 * 
	 * @param param
	 * @return
	 */
	public static <T> T fun(T param) {
		return param;
	}

	/**
	 * a generic method
	 * 
	 * access permission+ <T> + return type + name of method + (T name of parameter)
	 * 
	 * @param param1
	 * @param param2
	 * @return
	 */
	public static <T> void add(Info<T> param1, Info<T> param2) {
		System.out.println(param1.getVar() + " " + param2.getVar());
	}

	/**
	 * a generic method and the parameter of it is a generic array
	 * 
	 * @param args
	 * @return
	 */
	public static <T> T[] funArray(T... args) {
		for (T t : args) {
			System.out.println(t.toString());
		}
		return args;
	}

}
