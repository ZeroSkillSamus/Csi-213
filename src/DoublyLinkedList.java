




public class DoublyLinkedList {
public int size;
public Node root;
public Node prev;

public void add(Node n){
        if (n==null) return;
        if (root == null) {
            Node newNode = new Node(0, n.getName());
            root = newNode;
        }
        else {
            Node currentNode = root;
            while(currentNode.getNext()!=null){
                currentNode = currentNode.getNext();
            }
            int id = currentNode.getId();
            id ++;
            Node newNode = new Node(id, n.getName());
            currentNode.setNext(newNode);
        }
        size++;
}

public int getSize(){
	return size;
}

public void iterate(){
	if (root==null){
		return;
	} else {
		  Node currentNode = root;
          while(currentNode!=null){
        	  System.out.println(currentNode);
              currentNode = currentNode.getNext();
          }
	}
             
          }
public boolean findNode(Node node){
    if(root==null){
    	return false;
      } else {
    	  Node currentNode = root;
    	    while(currentNode.getName()!= node.getName()){
    	        System.out.println(root);
    	        currentNode = currentNode.getNext();
    	        System.out.println(currentNode);
    	        if(currentNode == null)
    	            return false;
    	  
   
    }
    return true;
}
}
}




