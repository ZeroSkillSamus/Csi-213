
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
	
	
	//searchs for the node and returns null if not found
		public BSTNode searchBST(String d) {
			BSTNode focusNode = head;

			while (focusNode != null) {
				if (d.equalsIgnoreCase(focusNode.getName())) {
					return focusNode;
				} else if (d.compareToIgnoreCase(focusNode.getName()) < 0) {
					focusNode = focusNode.getLeft();
				} else if (d.compareToIgnoreCase(focusNode.getName()) > 0) {
					focusNode = focusNode.getRight();
				}
			}

			return null;
		}

		//recursively calls the other add method
		public void add(String d) {
			BSTNode newNode = new BSTNode(d, 1);
			BSTNode temp = head;

			if (head == null) {
				head = newNode;
			}

			else {
				add(temp, d);
			}
		}

}

