package com.github.slamdunk.javabase.designpattern.behavior.menento;

/**
 * store the memento instance
 * @author liuzhongda
 *
 */
public class Storage {
	private Memento memento;

	public Storage(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
