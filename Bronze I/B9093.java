import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i<T;i++)
        {
            String [] s = br.readLine().split(" ");
            for(String word : s)
            {
                StringBuffer sb = new StringBuffer(word);
                System.out.print(sb.reverse().toString()+" ");
            }
            System.out.println();
        }
    }
}
