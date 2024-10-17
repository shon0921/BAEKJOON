import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();  // BufferedReader 닫기

        // 입력값 읽기
        String a = st.nextToken();
        String b = st.nextToken();
        String c = st.nextToken();

        BigInteger A = new BigInteger(a);   // 고정비용 (처음 생산 지출)
        BigInteger B = new BigInteger(b);   // 가변비용
        BigInteger C = new BigInteger(c);   // 판매가격

        // 가변비용이 판매가격보다 큰 경우, 손익분기점이 존재하지 않음
        if (B.compareTo(C) >= 0) {
            System.out.println("-1");
            return;
        }

        // 손익분기점 계산
        BigInteger count = A.divide(C.subtract(B)).add(BigInteger.ONE);
        
        // 결과 출력
        System.out.println(count);
    }
}
