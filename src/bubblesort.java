
public class bubblesort {
public Node head;

/*
 * checks to see if the list is empty
 */
public boolean isEmpty(){
	return (head==null);
}
/*
 * added the size method 
 * it returns the size of the list anytime something is added
 */
public int size ()
{
	//make a counter 
	int counter = 0;
	//if the list is empty return 0
	if (isEmpty())
	{
		return counter;
	} 
	else
	{
		//store the head inside a temp node
		Node temp = head;
		//loop through the list
		while (temp!=null)
		{
			//increment the counter by 1 
			counter++;
			//go on to the next node in the list until it reaches null and then breaks
			temp = temp.getNext();
		}
		//return the counter
		return counter;
	}
}
/*
 * method that is used to add something to the end of the list
 */
public void addNode (double data)
{
	//creates a new node
	Node newNode = new Node (data);
	
	//if the list is empty 
	if (isEmpty())
	{
		//set the head = to the newnode
		head = newNode;
		
	}
	
	else 
	{
		//store the head inside a temp node
		Node temp = head;
		//loop through the list 
		while (temp.getNext()!=null)
		{
			temp = temp.getNext();
		}
		//set the next null spot to the newNode
		temp.setNext(newNode);
	}
	
}



public void printList (){
	if (isEmpty()){
		return;
	}
	else {
		Node temp = head;
		while (temp!=null){
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}
public void bubblesortList ()
{
	if (head == null){
		return;
	}
	else 
	{

		  //Node temp = head;
		
       for (int i = 0;i<size();i++)
       {
    	   Node temp = head;
    	  
    	     for (int j = 0;j<size()-1;j++)
    	     {
    		  if (temp.getData()>temp.getNext().getData())
    		  {
    			  double curr = temp.getData();
    			  temp.setName(temp.getNext().getData());
    			  temp.getNext().setName(curr);
    			 
    		  }
    		  temp = temp.getNext();
    		
    	  }
    	 
    	  
      }
     
      
     
      


}
}
}
