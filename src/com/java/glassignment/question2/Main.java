package com.java.glassignment.question2;

public class Main {
	public static void main(String[] args) {

		BSTConversion convert = new BSTConversion();
		Node root = new Node(50);
		Node node1 = new Node(40);
		Node node2 = new Node(60);
		Node node3 = new Node(30);
		Node node4 = new Node(10);

		root.leftNode = node1;
		root.rightNode = node2;
		node1.leftNode = node3;
		node3.leftNode = node4;
		convert.inOrder(root);
		System.out.println("Inorder traversal with " + root.nodeData + " as headnode");

		convert.convertToskewed(root);
		System.out.println("Inorder traversal of right skewed tree with " + convert.headNode.nodeData + " as headnode");

	}

}
