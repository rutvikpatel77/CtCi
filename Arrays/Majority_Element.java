import java.util.HashMap;

/*
 *  A majority element in an array A[] of size n is an element that appears more than n/2 times
 *  (and hence there is at most one such element).Write a function which takes an array and
 *  emits the majority element (if it exists), otherwise prints NO
 *  
 */

class Majority_Element {

	private static void getHighest(int[] a) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0; i<a.length;i++){
			if(hm.containsKey(a[i])){
				hm.put(a[i], hm.get(a[i]) + 1);
			}
			else{
				hm.put(a[i],1);
			}
		}
		
		int max=0;
		int ans=0;
		
		for(int i=0;i<hm.size();i++){
			if(hm.get(a[i])>max){
				ans=a[i];
				max=hm.get(a[i]);
			}
		}
		
		if(max>a.length/2){
			System.out.print("Candidate "+ans+" is Majority element");
		}else{
			System.out.print("No Majority element");
		}
	}
		
	public static void main(String[] args) {		
		int[] a={3,2,2,2,1,3,3,4,3,3,2,3};
		getHighest(a);	
	}
}
