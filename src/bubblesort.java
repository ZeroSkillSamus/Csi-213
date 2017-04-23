
public class bubblesort {
public Node head;

public boolean isEmpty(){
	return (head==null);
}
public int size (){
	int counter = 0;
	if (isEmpty()){
		return counter;
	} else {
		Node temp = head;
		while (temp!=null){
			counter++;
			temp = temp.getNext();
		}
		return counter;
	}
}
public double addNode (double data)
{
	Node newNode = new Node (data);
	
	if (head==null)
	{
		head = newNode;
		
	}
	else 
	{
		Node temp = head;
		while (temp.getNext()!=null)
		{
			temp = temp.getNext();
		}
		temp.setNext(newNode);
	}
	return data;
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
