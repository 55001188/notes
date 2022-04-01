import java.util.ArrayList;

public class BinaryTree {
	
	Node head;
	int size;
	
	public BinaryTree() {
		head = null;
		size = 0;
	}
	
	/**
	 * Add node to the tree
	 * keeps the tree in a sorted fashion
	 * every node to the right of a node is greater-than or equal-to that node
	 * every node to the left of a node is less-than or equal-to that node
	 * @param args
	 */
	public void add(Node n) {
		if (head == null) {
			head = n;

		} else {
			Node curr = head;
			Node par;
			while(true) {
				par = curr;
				if(n.getData() < curr.getData()) {
					curr = curr.left;
					if(curr == null) {
						par.left = n;
						return;
					}
				} else {
					curr = curr.right;
					if(curr == null) {
						par.right = n;
						return;
					}
				}
			}
		
		}
		
		size ++;
	}
	
	
	public void print() {
		//print all the elements - no specifics on how for the time being
		//for testing purposes
		if(head == null) {
			System.out.print("");
		}
		Stack<Node> n = new Stack<Node>();
        n.push(head);
        
        while (n.size() != 0) {
            Node curr = n.peek();
            System.out.print(curr.getData() + " ");
            n.pop();
            
            if (curr.right != null) {
                n.push(curr.right);
            }
            if (curr.left != null) {
                n.push(curr.left);
            }
        }
		
		
	}
	
	public String bfs() { //visit every single level
		//return a string representation of nodes
		//in a breadth-first order
		//return levelTraverse(head);
		if(head == null){
		    return "";
		}
		String str = "";
		Queue<Node> queue = new Queue<Node>();
		queue.add(head);
		while(queue.size() != 0){
			Node node = queue.remove();
		    str += node.getData() + " ";
		    if(node.left != null){
		      queue.add(node.left);
		    }
		    if(node.right != null){
		      queue.add(node.right);
		    }
		}
		return str;
	}
	
	//pre-order depth-first-search traversal
	public String dfs() {
		return printPostorder(head);
		
	}
	
	String printPostorder(Node node) {
		if(node == null) {
			return "";
		} else {
			return printPostorder(node.left) + printPostorder(node.right) + (node.getData() + " "); 
		}
	}
	//			10
	//		1		11
	//	0
	// p(10) = p(1) + p(11) + 10
	// p(0) + "" + 1  "" + "" + 11
	// "" + "" + 0
	//0,1,11,10
	
	String printPreorder(Node node) {
		if(node == null) {
			return "";
		} else {
			return (node.getData() + " ") + printPreorder(node.left)+ printPreorder(node.right); 
		}
	}
	
	String printInorder(Node node) {
		if(node == null) {
			return "";
		} else {
			return printInorder(node.left) + (node.getData() + " ") + printInorder(node.right); 
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree b = new BinaryTree();
		b.add(new Node(10));
		b.add(new Node(1));
		b.add(new Node(11));
		b.add(new Node(0));
		System.out.print(b.dfs());
		System.out.println();
		System.out.print(b.bfs());
		System.out.println();
		b.print();
		
		

	}

}
