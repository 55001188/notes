import java.util.ArrayList;

public class Stack<T> {
	//data
	//replace type with "T" so that it can be replaced with any datatype later
	private ArrayList<T> data; //int[] data, String[] str
	private int size; //num of elements - not storage space size
	
	//constructor - should initialize array to have 10 spaces
	public Stack() {
		data = new ArrayList<T>();
		size = 0;
	}
	
	//getter for size
	public int size() {
		return size;
	}
	
	//push - add element to list
	public void push(T el) {
		data.add(el);
		size++; //update size
	}
	
	//pop - remove and return element from top of list
	//should be from the "top" of the list
	public T pop() {
		if(size == 0) {
			return null;
		}
		//remove and return element from the top of the list
		T obj = data.remove(data.size()-1);
		
		//update size
		size--;
		
		return obj;
	}
	
	public T peek() {
		if(size == 0) {
			return null;
		}
		return data.get(data.size()-1);
	}
	
	public String toString() {
		
		return data + "";
	}
	
	public static void main(String[] arg) {
		//add lines of code to test if out implementation of a Stack works
		Stack<Integer> test = new Stack<Integer>();
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
