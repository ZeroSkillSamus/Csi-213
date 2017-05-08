
public class BST {

public BSTNode head;

//calls the the other inroder method
public void inorder() {
	inorder(head);
}
//does the other stuff for inorder method by using recurssion
	private void inorder(BSTNode r) {
		if (r != null) {
			inorder(r.getLeft());
			System.out.println(r);
			inorder(r.getRight());

		}
	}

}

