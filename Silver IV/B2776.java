import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(b.readLine());
        for(int i=0;i<T;i++)
        {
            Set<Integer> set = new HashSet<>();        // set 선언
            int n = Integer.parseInt(b.readLine());
            StringTokenizer st = new StringTokenizer(b.readLine());
            for(int j=0;j<n;j++)
            {
                set.add(Integer.parseInt(st.nextToken()));      //set에 값 대입
            }
            int m = Integer.parseInt(b.readLine());
            st = new StringTokenizer(b.readLine());
            for(int j=0;j<m;j++){
                if (set.contains(Integer.parseInt(st.nextToken()))){    //입력 하자마자 set에 들어간 값과 비교
                    sb.append("1\n");    //있으면 1\ 저장
                } else {
                    sb.append("0\n");    //없으면 0\ 저장
                }
            }
        }
        System.out.println(sb);    //모든 입력이 끝난후 sb 안에 저장된 값 전부 출력
    }
}
