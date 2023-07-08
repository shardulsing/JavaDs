package GenericTreeAndBinaryTree;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree =new BinaryTree();
		tree.display();
		System.out.println("Height of Tree is ,"+tree.height());
		tree.preOrder();
		tree.inOrder();

	}

}
