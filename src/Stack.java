public class Stack {
public Node head;

//size method for the stack class
public int size (){
	int counter = 0;
	Node temp = head;
	while (temp!=null){
		counter++;
		temp = temp.getNext();
	}
	return counter;
	}


//added the push method which adds to the front of a stack
public void push (String n){
	//creates a new node
	
Node newNode = new Node(n);
	//checks to see if the list is empty
	if (head == null)
	{
		
		head = newNode;
		
	}
	else 
	{  
		//adds to the front of the list
		newNode.setNext(head);
        head = newNode;
        
    }
		
}
	
	
	

public String pop ()
{
	//checks to see if the list is empty
	if (head == null)
	{
		
		return null;
		
	}
	//checks to see if the list has one item in it
	else if(size() == 1)
	{
		//stores the head into a temp
		Node temp = head;
		//sets the head euqal to null 
		head =  null;
		
		return temp.getName();
	}
	else 
	{
		//if the list has more than 1 item in it it will set the head equal to the next item
		Node temp = head;
	
		head = head.getNext();
		

		return temp.getName();
	}
	
	
	
}
//added the peek method
public void peek ()
{
	//checks to see if the list is empty
	if (head == null)
	{
		
		return;
		
	}
	//prints the top of the stack
	System.out.println("Top of Stack = " + head.getName());
}
}


	


