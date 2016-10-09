package chapter_1;

// Given two strings check if they are permutations of each other
public class problem_1_2 {	
		
		public static void main(String args[]){
			
			String s1 = "ABCD";
			String s2 = "BADC";
			String ss1=sorted(s1);
			String ss2=sorted(s2);
			
			System.out.println(s1);
			System.out.println(s2);
			if(ss1==ss2){
				System.out.println("Permutation");
			}else{
				System.out.println("Not Permutation");
			}
			
		}
		
		public static String sorted(String s1){
			char[] content = s1.toCharArray();
			java.util.Arrays.sort(content);
			return new String(content);
			
		}
}
