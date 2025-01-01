import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean[] check = new boolean[101];
		
		Scanner ss = new Scanner(System.in);
		int size = s.nextInt();
		
		int cnt = 0;
		for(int i=0;i<size;i++) {
			int tmp = s.nextInt();
			
			if(check[tmp]==true)
				cnt++;
			else
				check[tmp] = true;
		}
		System.out.println(cnt);
	}
}
