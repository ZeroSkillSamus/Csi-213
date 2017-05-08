
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
		/*
		 * This method removed one of the leaves from the BST It takes in a
		 * paramater String n We make a focusnode and a parent node
		 * then deletes
		 */
		public void delete(String n)
		{

			BSTNode temp = searchBST(n);
	      //checks for the temp is equal to null
			if (temp == null)
			{
				//prints 
				System.out.println("Can't delete - " + n
						+ " does not exist in list.");
			} else {
				
				
				//checks for no children in the tree
				if (temp.getLeft() == null && temp.getRight() == null)
				{
					if (temp.getParent().getLeft() == null) {
						temp.getParent().setRight(null);
					} else {
						temp.getParent().setLeft(null);
					}

				}

				//checks if there is a left child but not a right child 
				else if (temp.getLeft() == null && temp.getRight() != null)
				{
					if (temp.getParent().getLeft() == null) {
						temp.getParent().setRight(temp.getRight());
					} else {
						temp.getParent().setLeft(temp.getRight());
					}
				}

				//checks if there is a left and 
				else if (temp.getRight() == null && temp.getLeft() != null) 
				{

					if (temp.getParent().getRight() == null) {
						temp.getParent().setLeft(temp.getLeft());
					} else {
						temp.getParent().setLeft(temp.getLeft());
					}
					
					
				}
				//checks if there are 2 children 
				else if (temp.getLeft() != null && temp.getRight() != null)
				{
					BSTNode temp2 = findMinimum(temp.getRight());
					String tempdata = temp.getName();
					temp.setName(temp2.getName());
					temp2.setName(tempdata);

					if (temp2.getParent().getRight() == temp2) {
						temp2.getParent().setRight(null);
					} else if (temp2.getParent().getLeft() == temp2) {
						temp2.getParent().setLeft(null);
					}
				}
			}
		}
		/*
		 * finds the minimum value in the array 
		 * recurssively calls the method until we get to null
		 */
			public BSTNode findMinimum(BSTNode t)
			{
				if (t.getLeft() == null) {
					return t;
				} else {
					return findMinimum(t.getLeft());
				}
			}


}

