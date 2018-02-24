package com.github.slamdunk.javabase.designpattern.interfaces;

public interface Collection<T> {

	public Iterator<T> iterator();

	/**
	 * get an elment in index i
	 * 
	 * @param i
	 * @return
	 */
	public T get(int i);

	/**
	 * get the size of the collection
	 * 
	 * @return
	 */
	public int size();
}
