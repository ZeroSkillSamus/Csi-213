
public class Node {
private int data;
private Node next;
private String name;

/*
 * constructor
 */
public Node (int data,String name){
	this.data=data;
	this.name=name;
}
/*
 * getters and setters
 */
public void setName (String n){
	n=name;
}

public String getName(){
	return name;
}

public Node getNext (){
	return next;
}

public void setNext (Node n){
	n = next;
}

public int getData (){
	return data;
}

public void setData (int d){
		d = data;
	}
}
