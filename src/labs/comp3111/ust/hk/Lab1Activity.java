package labs.comp3111.ust.hk;

public class Lab1Activity {
	public static void main(String[] arg){
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum =0;
		
		System.out.println(String.format("Sum of the numbers is %d" , sum));
		int min=999;
		int max=-999;
		for (int i=0; i< arr.length; i++){
			min = Math.min(min,arr[i]);
		}
		System.out.println(String.format("Min: %d" , min));
		
		for (int i=0; i< arr.length; i++){
			max = Math.max(max,arr[i]);
		}
		System.out.println(String.format("Max:%d" , max));

		
		
	}
	
}
