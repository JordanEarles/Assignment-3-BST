package bst;

public class Node {
	
	int Key;
	int Value;
	Node left;
	Node right;

	public Node insert(Node node, int value) {
		if (node == null) {
			return newNode(Value);
		}
		if (value < node.Value) {
			node.left = insert(node.left, value);
		}
		else if(value > node.Value) {
			node.right = insert(node.right, value);
		}
		return node;
	}

	public Node newNode(int key) {
		Node a = new Node();
		a.left = null;
		a.right = null;
		a.Key = key;
		return a;
	}
	
}
