
public class Queues {
public Node head;
public int size;


//checks the size and returns the size of the Queues
public int size(){
	int counter = 0;
	Node temp = head;
	while (temp!=null){
		counter++;
		temp = temp.getNext();
	}
	return counter;
	}

public boolean isEmpty(){
	return (head == null);
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
