


public class Stack {
public static Node head;

public static void push (String n){
	Node newNode = new Node(n);
	if (head==null)
	{
	      head = newNode;
	      //System.out.println(head);
		
	} 
	else 
	{
		//System.out.println(head);
		Node temp = head;
		while(temp!=null)
		{
			temp = temp.getNext();
			
			System.out.println(newNode);
		
			
		}
		
		temp = newNode;
		//System.out.println(n);
		
	}
	
	//System.out.println(newNode);
	
}

public static void pop ()
{
	if (head==null){
		return;
	} 
	else
	{
	
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.getPrev());
			temp = temp.getNext();
			
			temp = null;
		}
		System.out.println();
		//temp = null;
		
	}
	
}

public static Node peek (){
	if (head==null)
		{
		return null;
		}
	else {
		Node temp = head;
		while(temp!=null){
			System.out.println(temp);
			temp = temp.getNext();
	
		}
	return temp;
	}
}

public static void main (String[]args){
	Node n = new Node("String");
	push("I");
	push("Love");
	push("Computer");
	push("Science");
	
	
	pop();

	
}
}
