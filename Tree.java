package bst;

public class Tree extends Node {
	
	public static void main(String[] args) {
		Tree a = new Tree();
		Node root = null;
		
		root = a.insert(root, 12);
		root = a.insert(root, 7);
		root = a.insert(root, 18);
		root = a.insert(root, 15);
		root = a.insert(root, 16);
		root = a.insert(root, 2);
		root = a.insert(root, 5);
	}
}
