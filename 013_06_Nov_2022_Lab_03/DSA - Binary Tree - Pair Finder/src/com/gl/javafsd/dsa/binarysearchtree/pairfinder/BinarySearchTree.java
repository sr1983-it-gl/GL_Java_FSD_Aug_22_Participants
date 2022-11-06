package com.gl.javafsd.dsa.binarysearchtree.pairfinder;

public class BinarySearchTree {

	private BinarySearchTreeNode root;

	public BinarySearchTree() {
		root = null;
	}
	
	public BinarySearchTreeNode getRoot() {
		return root;
	}

	public void setRoot(BinarySearchTreeNode root) {
		this.root = root;
	}
	
	public void insert(Integer value) {
	
		root = insert(value, root);
	}

	private BinarySearchTreeNode insert(
		Integer value, BinarySearchTreeNode rootNode) {
		
		// First Time
		if (rootNode == null) {
			return createNewNode(value);
		}else if (value <= rootNode.getData()) {
			
			BinarySearchTreeNode leftNode = rootNode.getLeftNode();
			
			BinarySearchTreeNode newNode = insert(value, leftNode);
			rootNode.setLeftNode(newNode);
			return rootNode;
		}else {
			
			BinarySearchTreeNode rightNode = rootNode.getRightNode();
			
			BinarySearchTreeNode newNode = insert(value, rightNode);
			rootNode.setRightNode(newNode);
			return rootNode;
		}
		// NOT FIRST Time - Left side of tree
		// NOT FIRST Time - Right side of tree
		
	}
	
	BinarySearchTreeNode createNewNode(Integer data){
		
		BinarySearchTreeNode newNode = 
			new BinarySearchTreeNode(data);
		return newNode;
	}
	
	public void print() {
		
		preOrderTraversal();
	}
	
	public void preOrderTraversal() {
				
		preOrderTraversal(root);
	}
	
	private void preOrderTraversal(BinarySearchTreeNode node) {
	
		if (node == null) {
			return;
		}
		
//		System.out.println(node.getData());
		preOrderTraversal(node.getLeftNode());
		preOrderTraversal(node.getRightNode());
	}
}
