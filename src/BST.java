
public class BST {
public BSTNode root;

public void add (String n){
	BSTNode newNode = new BSTNode(n);
	
	if (root == null){
		root = newNode;
	}
}
}
