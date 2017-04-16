
public class bubblesort {
public Node head;

public int size (){
	if (head == null){
		return (Integer) null;
	} else {
		Node temp = head;
		int counter = 0;
		while (temp!=null){
			counter++;
			temp = temp.getNext();
		}
		return counter;
	}
}
}
