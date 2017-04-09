
public class Queues {
public Node head;
public int size;


//checks the size and returns the size of the Queues
public int size()
{
	int counter = 0;
	Node temp = head;
	while (temp!=null)
	{
		
		counter++;
		temp = temp.getNext();
		
	}
	return counter;
	}

//checks to see if the list is empty
public boolean isEmpty()
{
    //in order to check it checks to see if the head is equal to null
	return (head == null);
}

//traverses the Queue and prints it
public void printQueue ()
{
	if (isEmpty())
	{
		return;
	}
	
	Node temp = head;
	//makes sure the list isnt empty
	//prints the list anytime it runs through the while loop
	while (temp!=null)
	{
		System.out.println(temp.getName());
		temp = temp.getNext();
	}
	
	
}

//method that adds to the end of the queue
public void enqueue (String n){
	
	Node newNode = new Node (n);
	//checks to see if it is empty
	if (isEmpty()){
		
		head = newNode;
		size++;
		
	}
	
	else {
		
		Node temp = head;
		//loops through the list until it reaches null and then breaks
		while (temp.getNext()!=null)
		{
			
			temp = temp.getNext();
		}
		//adds the item to the end of the list
		temp.setNext(newNode);
		size++;
		
	}
	}



//method that deletes the first thing in the list
public String dequeue(){
	//checks to see if it is empty
	if (isEmpty())
	{
		return null;
	}
	
	//checks to see if the size is euql to 1
	else if(size() == 1)
	{
		//stores the head in a temp
		Node temp = head;
		//sets the head equal to null
		head = null;

		
		size--;
		return temp.getName();
	}
	{
		//stores the head inside a temp
		Node temp = head;
		//sets the head equal to the next one instead of setting it equal to null
		head = head.getNext();
		
		size--;
		return temp.getName();
	}
}


//method that returns and prints the top of the line of a queue
public void peek (){
	System.out.println("Top of line ig = " + head.getName());
}
}
