import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
    
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] x = new int[N];
		long allDistance = 0;	// 모든 쌍의 거리를 더한 값
		
		for(int i=0; i<N; i++) 
			x[i] = s.nextInt();
		
		for(int i=0; i<x.length; i++) 
			for(int j=0; j<x.length; j++) 
				allDistance += Math.abs(x[i]-x[j]);
		
		System.out.println(allDistance);
		scan.close();
	}

}
