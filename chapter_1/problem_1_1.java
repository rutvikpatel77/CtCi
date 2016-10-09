package chapter_1;
// check the string for duplicate characters

public class problem_1_1 {	
	
	public static void main(String args[]){
		
		String temp = "ABCEFA";
		boolean ans = isUnique(temp);
		System.out.println(ans);
	}
	
	public static boolean isUnique(String temp){
		
		if(temp.length()>128){
			return false;
			}
		
		else{
			boolean[] flag=new boolean[128];
			
			for(int i=0;i<temp.length();i++){
				
				int position=temp.charAt(i);
				System.out.println(position);
				if(flag[position]==true){
					return false;
				}
				else{
					
					flag[position]=true;
				}
			}
			return true;
		}		
		
	}
}
