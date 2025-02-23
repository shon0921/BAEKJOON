import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		long n = s.nextInt();
		long sum = 0;
		for(int i=1; i<n; i++) {
		sum += n*i+i;
		}
		System.out.print(sum);
	}
}
