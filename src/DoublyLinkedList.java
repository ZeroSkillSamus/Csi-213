
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
			/*checks to see if the list has more than 1 item 
	         * if it does will perform 3 cases
	         */
	    else
	 
	    {
	    	/*
	    	 * used to check to see if it is being added after the list
	    	 * set the tails next node to the newNode
	    	 * set the newNodes prev to the tail
	    	 * makes the newNode the tail
	    	 */
	    	if(newNode.getName().compareToIgnoreCase(tail.getName())>0)
	    	{
	    		tail.setNext(newNode);
	    		newNode.setPrev(tail);
	    		tail = newNode;
	    	}
	    	/*
	    	 * used to check to see if the newNode is being added before the list
	    	 * set the roots prevois to the newNode
	    	 * sets the newNodes next to the root
	    	 * makes the newNode the new root
	    	 */
	    	else if(newNode.getName().compareToIgnoreCase(root.getName())<0)
	    	{
	    		root.setPrev(newNode);
	    		newNode.setNext(root);
	    		root = newNode;
	    	}
	    	//if both previous arguments fail then we must add in the middle of the list
	    	else
	    	{
	    		//make a temp to iterate through the list
	    		Node temp = root;
	    		while (temp != null){
	    			// if the newNode is greater than, but less than add in the middle
	    			if (newNode.getName().compareToIgnoreCase(temp.getName())>0 && newNode.getName().compareToIgnoreCase(temp.getNext().getName())<0)
	    			{
	    				/*have to the the newnodes next to temps.getnext
	    				 * then newNodes prev to the temp
	    				 * set the temps next prevois to the newnode
	    				 * and the temps next to the newnode
	    				 */
	    				newNode.setNext(temp.getNext());
	    				newNode.setPrev(temp);
	    			    temp.getNext().setPrev(newNode);
	    			    temp.setNext(newNode);
	    			}
	    			temp = temp.getNext();
	    		}
	    	}
	    }
	
}
      //Destroy my list
        public void destroyList (){
        	this.root = null;
        }
        
        /*
         * loops through the whole entire list and prints everything forwards
         */
        public void traverseForward()
        {
        	Node temp = root;
        	while (temp!=null){
        		System.out.println(temp.getName());
        		temp = temp.getNext();
        	}
        }
        /*
         * start printing the list starting from the tail instead of the root
         * to print it backwards
         */
        public void traverseBackwards()
        {
        	Node temp = tail;
        	while (temp != null){
        		System.out.println(temp.getName());
        		temp = temp.getPrev();
        	}
        }
      //takes in a string and return a node 
        public Node findNode(String n){
            
        	      
            	  Node currentNode = root;
            	  
            	  //traverses the list
            	    while(currentNode!=null)
            	    	
            	    {
            	    	/*if n is equal to the currentnode name
            	    	 * print out that the node was found and return the current node 
            	    	 */
            	        if (n.equals(currentNode.getName()))
            	        	
            	        {
            	        	System.out.println("Found " + currentNode.getName());
            	        	return currentNode;
            	        }
            	        
            	       currentNode = currentNode.getNext();
        }
            	    //if not found will print not found and returns null
            	    
            	    System.out.println(" Not Found " + n);
            	    
            	    return null;
        }


	}
