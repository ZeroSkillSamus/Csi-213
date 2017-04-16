
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
public void add (int n){
	Node newNode = new Node (n);
	if (isEmpty()){
		head = newNode;
	} else {
		Node temp = head;
		while (temp!=null){
			temp = temp.getNext();
		}
		temp.setNext(newNode);
	}
}
}
