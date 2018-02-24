package com.github.slamdunk.javabase.clazscope;

/**
 * a class for defining inner classes
 * 
 * @author liuzhongda
 *
 */
public class OuterClass {
	private int val1;
	private int val2;

	public OuterClass(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	public int cal() {
		return new InnerClassA().cal();// the outer class can access the inner class as the normal class
	}

	/**
	 * define an inner class which can be accessed from other classes out of the
	 * same package
	 * 
	 * @author liuzhongda
	 *
	 */
	public class InnerClassA {
		public int cal() {
			return val1 + val2;// an member inner class can access all the fields of outer class
		}
	}

	/**
	 * define an inner class which only can be accessed from same package
	 * 
	 * @author liuzhongda
	 *
	 */
	class InnerClassB {
		public int cal() {
			return val1 + val2;// an member inner class can access all the fields of outer class
		}
	}

	/**
	 * define an embeded inner class which can be accessed from other classes out of
	 * the same package
	 * 
	 * @author liuzhongda
	 *
	 */
	public static class StaticInnerClassA {
		public int cal() {
			// return val1+val2;//an embeded inner class couldn't access the un-static
			// fields of the ourter class
			return 100;
		}
	}

	/**
	 * define an embeded inner class which only can be accessed from same package
	 * 
	 * @author liuzhongda
	 *
	 */
	static class StaticInnerClassB {
		public int cal() {
			return 101;
		}
	}

}
