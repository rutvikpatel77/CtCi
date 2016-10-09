package chapter_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Remove duplicates from an unsorted LinkedList

public class problem_2_1 {
		
	public static void main(String args[]){
		
		Node n1=new Node(1);
		n1.addToTail(2);
		n1.addToTail(3);
		n1.addToTail(4);
		n1.addToTail(5);
		
		Node n2=new Node(3);
		n2.addToTail(8);
		n2.addToTail(7);
		n2.addToTail(1);
		n2.addToTail(9);
				
		List<Integer> ans=new ArrayList<Integer>();
		ans=Find_Similar(n1,n2);
		System.out.println(ans.toString());		
	}
	
	private static List<Integer> Find_Similar(Node n1, Node n2) {

		ArrayList<Integer> ans=new ArrayList<Integer>();
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int index=1;
		
		while(n1.next!=null){
			hm.put(index,n1.data);
			index++;
			n1=n1.next;
		}
		while(n2!=null){
			if(hm.containsValue(n2.data)){
				ans.add(n2.data);				
			}
			n2=n2.next;
		}		
		
		return ans;
	}
}
