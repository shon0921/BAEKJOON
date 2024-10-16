import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();

        HashMap<Integer, String> h1 = new HashMap<>();
        HashMap<String, Integer> h2 = new HashMap<>();

        for(int i=1;i<=N;i++) {
            String S = s.next();
            h1.put(i,S);
            h2.put(S,i);
        }

        for(int i=0;i<M;i++) {
            String S = s.next();

            if (49 <= S.charAt(0) && S.charAt(0)<=57)
            {
                System.out.println(h1.get(Integer.parseInt(S)));
            } else {
                System.out.println(h2.get(S));
            }
        }
    }
}
