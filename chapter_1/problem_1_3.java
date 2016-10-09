package chapter_1;

// URLify - spcae replced by %20
public class Problem_1_3 {

	public static void main(String[] args) {

		String s="My Name Is Rutvik         ";
		int len=17;
		
		getAns(s,len);
	}

	private static void getAns(String s, int len) {
		
	/*	char[] str=s.toCharArray();
		char[] ans=new char[s.length()];
		int num = s.length()-len;
		int limit=num/2;
		int count = 0;
		
		for(int i=0;i<len;i++){
			
			if(str[i]==' '){
				ans.[i]='%';
				count++;
				
			}else{
				ans[i+count]=str[i];
			}
			
		}*/
		
		char[] ans=s.toCharArray();
		for(int i=0;i<len;i++){
			
			if(ans[i]==' '){
				//i=2;
				for(int n=i;n<len+i+1;n++){
					ans[n+3]=ans[n];
				}
				ans[i]='%';
				ans[i+1]='2';
				ans[i+2]='0';
				
			}else{
				continue;
			}	
		}
		System.out.println(ans.toString());
	}
}
