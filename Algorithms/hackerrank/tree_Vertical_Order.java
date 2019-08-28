package hackerrank;

class Node{
	int data;
	Node left,right;
	
	Node(int item){
		data=item;
		left=right=null;
	}	
}

class Values{
	int max, min;
}


public class tree_Vertical_Order {

	Node root;
	Values val= new Values();
	
	public static void main(String[] args) {
		tree_Vertical_Order  tree = new tree_Vertical_Order();
		
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.root.right.right.right = new Node(9);
  
        System.out.println("vertical order traversal is :");
        tree.verticalOrder(tree.root);
	}
	
	private void verticalOrder(Node node) {
		// Find min and max distances with resepect to root
		findMinMax(node, val, val, 0);
		//System.out.println(val.min);
		//System.out.println(val.max);
		
		for (int line_no = val.min; line_no <= val.max; line_no++){
				
			printVerticalLine(node, line_no, 0);
			System.out.println("");
		
		}
	}
	private void printVerticalLine(Node node, int line_no, int hd) {
		// TODO Auto-generated method stub
		if(node==null){
			return ;
		}
		
		if(line_no==hd){
			System.out.print(node.data+" ");
		}
		printVerticalLine(node.left,line_no,hd-1);
		printVerticalLine(node.right,line_no, hd+1);
	
	}
	private void findMinMax(Node node, Values min, Values max, int hd) {
	   // TODO Auto-generated method stub
		if(node==null){
			return;
		}
		
		if(hd< min.min){
			min.min=hd;
		}
		else if(hd>max.max){
			max.max=hd;
		}
		findMinMax(node.left,min,max,hd-1);
		findMinMax(node.right,min,max,hd+1);
	
	}	
}
