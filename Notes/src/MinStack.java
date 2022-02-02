
public class MinStack{
    
    //add any required isntance variables
    private StackInt type;
    private StackInt mins;
    private int size;
    
    //add a constructor
    public MinStack(){
        type = new StackInt();
        mins = new StackInt();
        size = 0;
    }
    
    public void push(int el){
        
        //if the min stack is empty, initialize min to el
        if(mins.size() == 0 && type.size() == 0){
            mins.push(el);
            type.push(el);
        } else if(el < (int)mins.peek()){//if the el is less than the last pushed el, then add to min
            mins.push(el);
            type.push(el);
        }else  if(el == (int)mins.peek()){ //if el is equal to top of type stack
        //make another instance of the min note it in mins stack
            mins.push(el);
            type.push(el);
        }else if(el > (int)mins.peek()){//if el is greater, don't do anything to mins stack
        	type.push(el);
        }
        
       
        
        
        System.out.println(type.toString());
        size++;
        
    }
    
    public int pop(){
        if(type.size() == 0){
            return 0;
        }
        
        
        //if top of type stack matches top of mins stack pop from both
        if((int)type.peek() == (int)mins.peek()){
            type.pop();
            mins.pop();
        } else { //if el is not in mins stack pop from type only
            type.pop();
        }
        
        
        size--;
        return (int)type.pop();
    }
    
    public int size(){
        return size;
    }
    
    /* returns the minimum element in the list.
       Does NOT modify the list */
    public int min(){
        if(mins.size() == 0){
            return 0;
        }
        return (int)mins.peek();
    }
    
    public static void main(String[] arg) {
    	MinStack m = new MinStack();
    	m.push(7);
    	m.push(3);
    	m.push(-5);
    	m.push(5);
    	m.push(2);
    	
    	m.pop();
    	m.pop();
    	m.pop();
    	m.pop();
    	System.out.println(m.min());
    }
    
}
