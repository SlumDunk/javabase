package com.github.slamdunk.javabase.designpattern.behavior.iterator;

import com.github.slamdunk.javabase.designpattern.interfaces.Collection;
import com.github.slamdunk.javabase.designpattern.interfaces.Iterator;

public class MyCollection<T> implements Collection<T> {
	private T array[] = null;

	public MyCollection(T[] array) {
		this.array = array;
	}

	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>(this);
	}

	public T get(int i) {
		// TODO Auto-generated method stub
		return array[i];
	}

	public int size() {
		// TODO Auto-generated method stub
		return array.length;
	}

}
