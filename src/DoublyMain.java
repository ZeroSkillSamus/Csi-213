
public class DoublyMain {

	public static void main(String[] args) {
       DoublyLinkedList LL = new DoublyLinkedList();
       Node N = new Node (5,"Book");
       Node W = new Node (7,"Yoll");
      // System.out.println(N.getName());
       LL.add(N);
       LL.add(W);
       LL.iterate();
       //System.out.println(W.getId());
       //System.out.println(LL.getSize());
       System.out.println(LL.findNode(W));
	}

}
