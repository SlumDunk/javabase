package com.github.slamdunk.javabase.generic.classes;

/**
 * the nested generic class
 * @author liuzhongda
 *
 * @param <T>
 * @param <V>
 */
public class ContainerInfo<T, V> {
	private T var;
	private V value;

	public ContainerInfo(T var, V value) {
		this.setVar(var);
		this.setValue(value);
	}

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}
