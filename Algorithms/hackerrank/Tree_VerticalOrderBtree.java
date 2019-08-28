package hackerrank;

import java.beans.VetoableChangeSupport;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public class Tree_VerticalOrderBtree {

	Node root;
	
	public static void main(String[] args) {
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
        System.out.println("Vertical Order traversal is");
        printVerticalOrder(root);
		
	}

	private static void printVerticalOrder(Node root) {
		
		// Create a map and store vertical oder in map using function getVerticalOrder()
		
		TreeMap<Integer, Vector<Integer>> m = new TreeMap<>();
		int hd=0;
		getVerticalOrder(root,hd,m);
		
		for( Entry<Integer,Vector<Integer>> entry : m.entrySet()){
			System.out.println(entry.getValue());
		}	
		
	}

	private static void getVerticalOrder(Node root, int hd, TreeMap<Integer, Vector<Integer>> m) {
		// TODO Auto-generated method stub
		if(root==null){
			return;
		}
		
		Vector<Integer> get = m.get(hd);
		if(get==null){
			get= new Vector<>();
			get.add(root.data);
		}
		else
		{
			get.add(root.data);
		}
		
		m.put(hd, get);
		getVerticalOrder(root.left, hd-1, m);
		getVerticalOrder(root.right, hd+1, m);
			
	}
}
