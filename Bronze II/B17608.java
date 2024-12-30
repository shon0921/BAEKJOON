import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++)
			arr[i] = s.nextInt();
		
		int count = 1;		// 
		int maxHeight = arr[arr.length-1];	// 가장 높은 막대기의 높이
	
		for(int i=arr.length-2; i>=0; i--) {
			if(arr[i] > maxHeight) {
				count ++;
				maxHeight = arr[i];
			}
		}
		
		System.out.println(count);
	}
}
