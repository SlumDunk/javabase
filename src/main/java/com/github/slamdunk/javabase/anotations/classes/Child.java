package com.github.slamdunk.javabase.anotations.classes;

import com.github.slamdunk.javabase.anotations.MyAnotation;
import com.github.slamdunk.javabase.anotations.MyEnum;
import com.github.slamdunk.javabase.anotations.interfaces.People;

public class Child implements People {

	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	public String age() {
		// TODO Auto-generated method stub
		return null;
	}

	public void work() {
		// TODO Auto-generated method stub

	}

	@MyAnotation(valueStr = "Doug", valueEnum = MyEnum.Sunny, valueArray = { "a", "b", "c" })
	public void sayAnotation() {
		return;
	}

}
