package com.github.slamdunk.javabase.designpattern.structure.composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {
	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();

	public TreeNode(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	/**
	 * add a child node
	 * 
	 * @param node
	 */
	public void add(TreeNode node) {
		children.add(node);
	}

	/**
	 * del the child node
	 * 
	 * @param node
	 */
	public void remove(TreeNode node) {
		children.remove(node);
	}

	/**
	 * get the children nodes
	 * 
	 * @return
	 */
	public Enumeration<TreeNode> getChildren() {
		return children.elements();
	}

}
