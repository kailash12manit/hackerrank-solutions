package hackerrank;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	int data;
	TreeNode left , right;
	TreeNode(int data){
		this.data=data;
		left=right=null;
	}
}

class Qnode{
	TreeNode node;
	int hd;
	Qnode(TreeNode node, int hd){
		this.node= node;
		this.hd=hd;
	}
}
class Tree{
	TreeNode node;
    Tree(){
    	node=null;
    }
    
	public Tree(TreeNode root) {
		// TODO Auto-generated constructor stub
		node=root;
	}

	public void printTopView() {
		// TODO Auto-generated method stub
		if(node==null){
			return;
		}
        HashSet<Integer>set = new HashSet<Integer>();
         // Create a queue and add root to it
        Queue<Qnode> q= new LinkedList<Qnode>();
        q.add(new Qnode(node,0)); // Horizontal distance of root is 0
        
        // Standard BFS or level order traversal loop
        while(!q.isEmpty()){
        	
        	Qnode qi = q.remove();
        	int hd= qi.hd;
        	TreeNode n= qi.node;
        	
        	
        	if(!set.contains(hd)){
        		set.add(hd);
        		System.out.println(n.data+" ");
        	}
        	
        	
        	if(n.left!=null){
        		q.add(new Qnode(n.left, hd-1));
        	}
        	if(n.right!=null){
        		q.add(new Qnode(n.right,hd+1));
        	}
        	
        }
        
		
	}
}

public class Top_view_bT{
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);
        Tree t = new Tree(root);
        System.out.println("Following are nodes in top view of Binary Tree");
        t.printTopView();
		
	}
	
}
