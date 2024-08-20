import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//입력
		int n = Integer.parseInt(br.readLine());
		String x;
	
		for(int i = 0; i < n; i++) {
			
			x = br.readLine(); //숫자 입력
			int[] arr = new int[x.length()]; 

			for(int j = 0; j < x.length(); j++) {
				
				arr[j] = 0; //초기화
				arr[j] = x.charAt(j) - 48; //각 자리수로 나눠 저장하기
			}
			for(int k = x.length() - 1; k >= 1; k--) {		
				
				if(arr[k] > 4) //현재 자리수가 4보다 크면
					arr[k - 1] += 1; //앞 자리수에 1증가
				
				arr[k] = 0; //현재 자리수는 0으로 바꾸기
			}
			
			for(int p = 0; p < x.length(); p++)
				System.out.print(arr[p]);
			
			System.out.println();
		}
	}
}
