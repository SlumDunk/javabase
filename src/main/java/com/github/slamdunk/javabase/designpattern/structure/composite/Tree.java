package com.github.slamdunk.javabase.designpattern.structure.composite;

public class Tree {
	public TreeNode root = null;

	public Tree(String name) {
		root = new TreeNode(name);
	}
}
