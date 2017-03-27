
public class DoublyLinkedList {
	public Node root;
	public Node tail;
	public float[] thingag;
	/*
	 * method to keep track of the size of the list
	 * traverses the list and increments the counter every time something is added
	 * returns the counter 
	 */
	public int size()
	{
		
		int counter = 0;
		Node temp = root;
		
		while(temp != null)
		{
			counter++;
			temp = temp.getNext();
		}
		
		return counter;
	}
	public void add(String n){
		
        Node newNode = new Node(n);
        
       //if there is nothing in the list
        if (root == null) {
        root = tail = newNode;
    }
        //checks to see if the list has 1 item in it
	else if(size()==1)
	{
		/*compares the newnode data to the tails data 
		 * if its greater than 0 add after the new node after the list
		 * makes the newnode the tail
		 */
		if(newNode.getName().compareToIgnoreCase(tail.getName())>0)
		{
			tail = newNode;
			root.setNext(tail);
			tail.setPrev(root);
		}
		/*
		 * will add before the list if the first if statement is false
		 * makes the newnode the new root
		 */
		else
		{
			root = newNode;
			root.setNext(tail);
			tail.setPrev(root);
		}
	}
}
