package com.github.slamdunk.javabase.designpattern.creator.singleton;

/**
 * a singleton class
 * 
 * @author liuzhongda
 *
 */
public class Singleton {
	/**
	 * the constructor can't be accessed outside from this class
	 */
	private Singleton() {
	}

	/**
	 * a embeded inner class for maintaining the single instance
	 * 
	 * @author liuzhongda
	 *
	 */
	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
	}

	/**
	 * get the instance
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		return SingletonFactory.instance;
	}
	
	

	public void sayHello() {
		System.out.println("hello, I am a single instance");
	}
}
