package com.gl.javafsd.dsa.binarysearchtree.pairfinder;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		
		sampleBinaryTree1();
	
	}
	
	public static BinarySearchTree sampleBinaryTree1() {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(70);
		tree.insert(50);
		tree.insert(30);
		tree.insert(10);
		tree.insert(60);
		tree.insert(20);
		tree.insert(40);
		
		tree.print();
		
		return tree;
	}
}
