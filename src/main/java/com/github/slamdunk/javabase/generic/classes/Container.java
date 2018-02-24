package com.github.slamdunk.javabase.generic.classes;

/**
 * the parent container generic class
 * 
 * @author liuzhongda
 *
 * @param <S>
 */
public class Container<S> {
	private S info;

	public Container(S info) {
		// TODO Auto-generated constructor stub
		this.info = info;
	}

	public S getInfo() {
		return info;
	}

	public void setInfo(S info) {
		this.info = info;
	}

}
