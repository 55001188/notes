public class Node{
    private int data;
    public Node right;
    public Node left;
    
    public Node(int t) {
        data = t;
        right = null;
        left = null;
    }
    
    public int getData() {
        return data;
    }
    
    public void setData(int t) {
        data = t;
    }
    
    
}