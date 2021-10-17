package com.java.glassignment.question2;

class Node {
	int nodeData;
	Node leftNode, rightNode, headNode;

	Node(int val) {
		nodeData = val;
		leftNode = rightNode = null;
	}
}

public class BSTConversion {

	public Node headNode, right;

	public void convertToskewed(Node root) {
		if (root == null) {
			return;
		}
		convertToskewed(root.leftNode);
		if (right == null) {
			headNode = root;
			right = root;

		} else {
			root.leftNode = null;
			right.rightNode = root;
			right = root;
		}

		System.out.println(root.nodeData + " ");
		convertToskewed(root.rightNode);

	}

	public void inOrder(Node root) {
		if (root == null) {
			return;

		} else {
			inOrder(root.leftNode);
			System.out.println(root.nodeData + " ");
			inOrder(root.rightNode);

		}

	}

}
