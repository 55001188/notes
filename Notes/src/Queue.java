
public class Queue<T> {
	private Stack<T> in;
	private Stack<T> out;
	private int size = 0;
	
	public Queue(){
		in = new Stack<T>(); //contains elements pushed into queue (1, 2, 3)
		out = new Stack<T>(); //contains elements popped from "in" stack (3, 2, 1)
	}
	public void add(T el) {
		in.push(el); //puts elements into in stack
		size++;
	}
	public T remove() {
		if(out.size() == 0 && in.size() == 0) {
			return null; //return null if empty
		}
		//if there is nothing in the out stack, 
		if(out.size() == 0) {
			for(int i = in.size()-1; i >= 0; i--) {
				//push all the elements popped from the in stack, to the out stack
				out.push(in.pop());
			}
			size--;
			return out.pop(); //returns last element of out stack
			
		} else { //if out is not zero
			size --;
			return out.pop(); //returns last element of out stack
			
		}
		
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		//print your queue
		return "in: " + in;
	}
	
	//first in first out (FIFO) QUEUES
	//the first element put in will be the first to come out
	//Last in first out (LIFO) STACKS
	//the last element put in will be the first to come out
	
	public static void main(String[] arg) {
		Queue<Integer> t = new Queue<Integer>();
		t.add(1);
		//System.out.println(t.toString());
		t.add(2);
		//System.out.println(t.toString());
		t.add(3);
		//System.out.println(t.toString());
		
		System.out.println(t.toString() + " removed: " + t.remove());
		
		
	}
}
