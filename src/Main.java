
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
	
	//turns the stack to a queue
public static Queues stackstoQueues(Stack stack){
		//makes a new queue
		Queues queues = new Queues(); 
		
		//stores the stack.pop into a temp
		String temp = stack.pop();
		
		//while the list is not empty
		while(temp != null)
		{
			//enqueue the stuff that you poped into the new queue
			queues.enqueue(temp);
			//make sure the temp decrements until its empty
			temp = stack.pop();
		}
	    
	    return queues;
		}

	/*public static Stack queuestoStacks(Queues queue)
	{
		Stack stack = new Stack();
		String temp = queue.dequeue();
		
		while (temp != null) {
			stack.push(temp);
			temp = queue.dequeue();
		}
		
		return stack;
		/*int length = queue.size();
		
		for ( int i = 0;i<length;i++){
			stack.push(queue.dequeue());
		}
		
		return stack;
		*/
	
	
	public static Stack stackstoStacks(Stack stack)
	{
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		
		int length = stack.size();
		for (int i = 0;i<length;i++){
		stack1.push(stack.pop());
		}
		for(int j = 0; j < length; j++){
			stack2.push(stack1.pop());
		}
		
		return stack2;
	}

	}
