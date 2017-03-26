
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

}
