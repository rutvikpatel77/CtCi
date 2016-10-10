import java.util.ArrayList;

public class Count_Nodes {

	Tree_Node root;
	int count=0;
	
	ArrayList<Integer> a=new ArrayList<Integer>();
	Count_Nodes()
	{
	        root = null;
	}
	
	public void inOrder(Tree_Node root){
		
		if(root==null) return;
		
		if(root.left==null && root.right==null){
			count++;
		}
		
		inOrder(root.left);
		a.add(root.key);
		inOrder(root.right);
		
	}
	
	public int countNodes(Tree_Node root){
		inOrder(root);	
		return a.size();
	}
	
	public static void main(String[] args) {
		
		/*
		 * 			 1
		 *			/ \ 			
		 *		   2   3
		 * 		  / \
		 * 		 4   5
		 * 	    / \
		 * 	   6   7
		 */
		
		Count_Nodes tree=new Count_Nodes();
		tree.root = new Tree_Node(1);
        tree.root.left = new Tree_Node(2);
        tree.root.right = new Tree_Node(3);
        tree.root.left.left = new Tree_Node(4);
        tree.root.left.left.left = new Tree_Node(6);
        tree.root.left.left.right = new Tree_Node(7);
        tree.root.left.right = new Tree_Node(5);
        
                
        int i=tree.countNodes(tree.root);
		System.out.println(i);
	}

}
