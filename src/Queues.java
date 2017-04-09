
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

public void printQueue ()
{
	Node temp = head;
	
	while (temp!=null)
	{
		System.out.println(temp.getName());
		temp = temp.getNext();
	}
	
	
}
public void enqueue (Node n){
	
}

public Node dequeue(Node n){
	return n;
}
public Node peek (){
	return n;
}
}
