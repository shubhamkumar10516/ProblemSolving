package bst;

public class Search {

	public static void main(String[] args) {
		
		// create binary search tree
		
		Node root = new Node(15);
		root.setLeft(new Node(5));
		root.setRight(new Node(20));
		root.getLeft().setLeft(new Node(3));
		root.getRight().setLeft(new Node(18));
		root.getRight().setRight(new Node(80));
		root.getRight().getLeft().setLeft(new Node(16));
		
		
		// naive approach to search: preorder traversal (any other DFS traversal)
		int key = 7;
		boolean[] result = {false};
		if(result[0]) {
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}
		
	}
	
	static void inorder(Node root, int key, boolean[] result) {
		if(root == null) return;
		inorder(root.getLeft(), key, result);
		if(root.getKey() == key) {
			result[0] = true;
			return;
		}
		inorder(root.getRight(), key, result);
	}
}


