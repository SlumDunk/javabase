package com.github.slamdunk.javabase.designpattern.interfaces;

public interface Iterator<T> {
	/**
	 * get previous element
	 * 
	 * @return
	 */
	public T previous();

	/**
	 * get next element
	 * 
	 * @return
	 */
	public T next();

	public boolean hasNext();

	/**
	 * get first elment
	 * 
	 * @return
	 */
	public T first();
}
