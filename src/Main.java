
public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack();
		Queues queues = new Queues();
		
		stack.push("Science");
		stack.push("Computer");
		stack.push("Love");
		stack.push("I");
	
		queues.enqueue("DADADA");
		queues.enqueue("Hahah");
		queues.enqueue("KYS");
		queues.enqueue("ADAAD");
		
		Stack newStack = queuestoStacks(queues);
		newStack.print();
		System.out.println();
		Stack newStack2 = stackstoStacks(newStack);
		newStack2.print();
		System.out.println();
		Queues newQueue = stackstoQueues(newStack2);
		newQueue.printQueue();
		}
	
	

	}
