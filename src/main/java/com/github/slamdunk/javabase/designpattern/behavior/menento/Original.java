package com.github.slamdunk.javabase.designpattern.behavior.menento;

/**
 * original class
 * 
 * @author liuzhongda
 *
 */
public class Original {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Original(String value) {
		this.value = value;
	}

	/**
	 * create the memento instance to save the current value
	 * 
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(value);
	}

	/**
	 * restore the last value back to the original instance
	 * 
	 * @param memento
	 */
	public void resetStatus(Memento memento) {
		this.value = memento.getValue();
	}
}
