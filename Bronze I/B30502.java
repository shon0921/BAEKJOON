import java.io.*;
import java.util.*;

public class Main {
	
	// 미역의 실험 결과를 저장할 클래스
	private static class Seaweed {
		int p, m;
		
		public Seaweed(int p, int m) {
			this.p = p;
			this.m = m;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 생물의 수
		int m = Integer.parseInt(st.nextToken()); // 실험의 수
		
		// 미역 실험 결과를 저장할 리스트
		List<Seaweed> list = new LinkedList<>();
		
		// 미역의 번호가 1부터 시작하기 때문에 n보다 1를 추가한다.
		for (int i = 0; i <= n; i++) {
			list.add(new Seaweed(-1, -1)); // 아무 값이 없는 경우를 -1로 지정
		}
		
		int num, ot;
		String pm;
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken()); // 미역의 번호
			pm = st.nextToken(); // 실험 종목
			ot = Integer.parseInt(st.nextToken()); // 실험 결과 
			
			switch (pm) {
			case "P": // 광합성
				list.get(num).p = ot;
				break;
			case "M": // 운동성
				list.get(num).m = ot;
				break;
			}
		}
		
		int min = 0; // 최솟값
		int max = 0; // 최댓값
		
		for (int i = 1; i <= n; i++) {
			// 확실히 광합성만 가지고 있는 경우
			if (list.get(i).p == 1 && list.get(i).m == 0) {
				min++;
			}
			
			// 광합성을 가지거나 아직 실험을 안하고 운동성이 없거나 실험을 안했을 때
			if ((list.get(i).p == 1 || list.get(i).p == -1) && (list.get(i).m == -1 || list.get(i).m == 0)) {
				max++;
			}
		}
		
		sb.append(min).append(" ").append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
