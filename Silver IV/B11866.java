import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        LinkedList<Integer> q = new LinkedList<>();

        for(int i=1;i<=N;i++)
        {
            q.add(i);
        }
        sb.append("<");

        while (!q.isEmpty())
        {
            for(int i=0;i<K-1;i++)
            {
                int temp = q.poll();
                q.add(temp);
            }
            int num = q.poll();
            sb.append(num);
            if(!q.isEmpty()){
                sb.append(", ");
            }

        }
        sb.append(">");
        System.out.println(sb.toString());
    }
}
