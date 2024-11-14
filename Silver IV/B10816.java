import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> H = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N ;i++)
        {
            String key = st.nextToken();
            if(H.containsKey(key))
            {
                H.put(key,H.get(key) +1);
            } else {
                H.put(key,1);
            }
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<M;i++)
        {
            String key = st.nextToken();
            if(H.get(key) != null){
                sb.append(H.get(key)).append(" ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb.toString());
    }
}
