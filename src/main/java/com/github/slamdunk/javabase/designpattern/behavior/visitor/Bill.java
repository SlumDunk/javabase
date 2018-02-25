package com.github.slamdunk.javabase.designpattern.behavior.visitor;

public interface Bill {
	void accept(Visitor visitor);
}
