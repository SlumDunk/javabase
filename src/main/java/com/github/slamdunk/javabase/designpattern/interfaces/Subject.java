package com.github.slamdunk.javabase.designpattern.interfaces;

/**
 * a subject which is observed by observers
 * 
 * @author liuzhongda
 *
 */
public interface Subject {
	/**
	 * add an observer
	 * 
	 * @param observer
	 */
	public void add(Observer observer);

	/**
	 * delete an observer
	 * 
	 * @param observer
	 */
	public void del(Observer observer);

	/**
	 * notify all observers
	 */
	public void notifyObservers();

	/**
	 * own operation
	 */
	public void operation();
}
