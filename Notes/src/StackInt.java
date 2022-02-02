import java.util.ArrayList;

public class StackInt {
	//data
	//replace type with "T" so that it can be replaced with any datatype later
	private ArrayList<Integer> data; //int[] data, String[] str
	private int size; //num of elements - not storage space size
	
	//constructor - should initialize array to have 10 spaces
	public StackInt() {
		data = new ArrayList<Integer>();
		size = 0;
	}
	
	//getter for size
	public int size() {
		return size;
	}
	
	//push - add element to list
	public void push(int el) {
		data.add(el);
		size++; //update size
	}
	
	//pop - remove and return element from top of list
	//should be from the "top" of the list
	public int pop() {
		if(size == 0) {
			return 0;
		}
		//remove and return element from the top of the list
		int obj = data.remove(data.size()-1);
		
		//update size
		size--;
		
		return obj;
	}
	
	public int peek() {
		if(size == 0) {
			return 0;
		}
		return data.get(data.size()-1);
	}
	
	public String toString() {
		
		return data + "";
	}
	
	public static void main(String[] arg) {
		//add lines of code to test if out implementation of a Stack works
		StackInt test = new StackInt();
		test.push(4);
		System.out.println(test.toString());
		test.push(3);
		System.out.println(test.toString());
		test.push(2);
		System.out.println(test.toString());
		test.push(1);
		System.out.println(test.toString());
		test.pop();
		System.out.println(test.toString());
	}
	
	
	
	
	
	
	
	
	
}
