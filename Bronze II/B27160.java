import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<N;i++)
        {
            String S = s.next();
            int b = s.nextInt();
            map.put(S,map.getOrDefault(S,0)+b);
        }
        String answer = "NO";

        for (String key : map.keySet()) {
            if(map.get(key)==5)
            {
                answer="YES";
            }
        }
        System.out.println(answer);
    }
}
