package GenericTreeAndBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	Node root = null;
	int size = 0;

	BinaryTree() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node parent, boolean isLeftOrRight) {
		if (parent == null) {
			System.out.println("Enter the data of root node");
		} else {
			if (isLeftOrRight) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of" + parent.data);
			}
		}

		int nodeData = s.nextInt();
		Node node = new Node(nodeData, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Do you have left child of " + nodeData);
		choice = s.nextBoolean();
		if (choice) {
			node.left = takeInput(s, node, true);
		}
		choice = false;
		System.out.println("Do you have right child of " + nodeData);
		choice = s.nextBoolean();
		if (choice) {
			node.right = takeInput(s, node, false);
		}

		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		String str = "";
		if (node.left != null) {
			str = str + node.left.data + "=>";
		} else {
			str = str + "END=>";
		}
		str = str + node.data;
		if (node.right != null) {
			str = str + "<=" + node.right.data;
		} else {
			str = str + "<=END";
		}
		System.out.println(str);
		if (node.left != null) {
			this.display(node.left);
		}
		if (node.right != null) {
			this.display(node.right);
		}
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lheight = this.height(node.left);
		int rheight = this.height(node.right);
		int height = Math.max(lheight, rheight) + 1;
		return height;
	}

	public void preOrder() {
		this.preOrder(this.root);
		System.out.println("END");
	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.data);
		preOrder(node.left);
		preOrder(node.right);

	}

	public void inOrder() {
		this.inOrder(this.root);
		System.out.println("END");
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.println(node.data + ", ");
		inOrder(node.right);
	}

	public void postOrder() {
		this.postOrder(this.root);
		System.out.println("END");
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data + ", ");
	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while (!queue.isEmpty()) {
			Node rv = queue.removeFirst();
			System.out.println(rv.data + ", ");
			if (rv.left != null) {
				queue.addLast(rv.left);
			}
			if (rv.right != null) {
				queue.addLast(rv.right);
			}
		}
		System.out.println("END");
	}

	public boolean isBST() {
		return this.isBST(this.root, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBST(Node node, int min, int max) {
		if (node == null) {
			return true;
		}
		if (node.data > max || node.data < min) {
			return false;
		} else if (!this.isBST(node.left, min, node.data)) {
			return false;
		} else if (!this.isBST(node.right, node.data, max)) {
			return false;
		}

		return true;

	}

	public int sumLeaf() {
		return this.sumLeaf(this.root);
	}

	private int sumLeaf(Node node) {
		if (node == null) {
			return 0;
		}
		if (node.left == null && node.right == null) {
			return node.data;
		}
		int lsum = sumLeaf(node.left);
		int rsum = sumLeaf(node.right);
		return lsum + rsum;
	}

	public List<Integer> inorderTraverIterative() {
		return this.inorderTraverIterative(this.root);
	}

	private List<Integer> inorderTraverIterative(Node node) {
		Stack<Node> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		while (true) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				if (stack.isEmpty()) {
					break;
				}
				node = stack.pop();
				list.add(node.data);
				node = node.right;
			}

		}
		return list;
	}
}
