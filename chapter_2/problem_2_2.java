package chapter_2;


//	Find Kth to last Element

public class problem_2_2 {
	
	public static void main(String args[]){
		
		Node n1=new Node(10);
		n1.addToTail(20);
		n1.addToTail(30);
		n1.addToTail(40);
		n1.addToTail(50);
		n1.addToTail(60);
		n1.addToTail(70);
		n1.addToTail(80);
		n1.addToTail(90);
		n1.addToTail(100);
		
		int ans=findAnswer(n1,11);
		System.out.println("Kth Last Element is : "+ans);
	
	
	}

	private static int findAnswer(Node n1, int k) {
		// TODO Auto-generated method stub
		int count=1;
		
		Node head=n1;
		
		while(head.next!=null){
			head=head.next;
			count++;
		}
		
		for(int i=1;i<=count-k;i++){
			n1=n1.next;
		}
		return n1.data;
	}
}
