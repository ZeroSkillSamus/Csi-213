
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
		/*
		 * Adds the nodes in by using recursion 
		 * has 3 cases 
		 */
		private void add(BSTNode temp, String d)
		{
			
	     //checks to see if what your adding is less than 0
	     //add it to the left side
			if ((d.compareToIgnoreCase(temp.getName())) < 0)
			{

				if (temp.getLeft() != null) {

					add(temp.getLeft(), d);
				} else {

					temp.setLeft(new BSTNode(d, 1));
					temp.getLeft().setParent(temp);
				}
			}
	         //checks to see what your adding is greater than zero 
			//add it to the right side
			else if ((d.compareToIgnoreCase(temp.getName())) > 0) {

				if (temp.getRight() != null) {
					add(temp.getRight(), d);
				}

				else {
					temp.setRight(new BSTNode(d, 1));
					temp.getRight().setParent(temp);
				}
			}
	//checks to see what your adding is equal to the head 
	//if it is increment the counter by 1
			else if (d.compareTo(temp.getName()) == 0) {
				temp.incrementCounter();
			}
		}


}

