package chapter_2;


public class Node{
	
	public Node next=null;
	public int data;
		
	public Node(int d){
		data=d;
	}
	
	public void addToTail(int d){
		Node last=new Node(d);
		
		Node n=this;
		
		while(n.next!=null){
			n=n.next;
		}		
		n.next=last;
	}
	
	public void print_LL(){
		
		Node n=this;
		
		while (n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
}