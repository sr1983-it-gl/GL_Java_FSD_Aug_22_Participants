package com.gl.javafsd.dsa.lca;

public class BinaryTreeTest {

	public static void main(String[] args) {
		
		BinaryTree tree = _10_70_BinaryTree();		
	}
	
	private static BinaryTree _10_70_BinaryTree() {
		
		Node _10 = new Node("10");
		
		Node _20 = new Node("20");		
		_10.setLeft(_20);
		
		Node _40 = new Node("40");
		_20.setLeft(_40);
		
		Node _50 = new Node("50");
		_20.setRight(_50);
		
		Node _30 = new Node("30");
		_10.setRight(_30);
		
		Node _60 = new Node("60");
		_30.setLeft(_60);
		
		Node _70 = new Node("70");
		_30.setRight(_70);
		
		BinaryTree tree = new BinaryTree(_10);
		return tree;
	}
}
