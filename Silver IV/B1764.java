import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        int n = s.nextInt();

        HashSet<String> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(s.next());
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i=0;i<m;i++)
        {
            String t = s.next();
            if(set.contains(t))
            {
                result.add(t);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for (String S : result)
        {
            System.out.println(S);
        }
    }
}
