package com.github.slamdunk.javabase.designpattern.behavior.menento;

/**
 * save the status of fields in the original instance
 * 
 * @author liuzhongda
 *
 */
public class Memento {
	private String value;

	public Memento(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
