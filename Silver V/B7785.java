import java.util.*;

public class Main {
    public static void main(String []args)  {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        HashSet<String> set = new HashSet<>();

        for(int i=0;i<N;i++)
        {
            String a = s.next();
            String b = s.next();

            if(b.equals("enter"))
            {
                set.add(a);
            } else {
                set.remove(a);
            }
        }
        List<String> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder()); // 사전 순의 역순으로 정렬
        for(String name : list)
        {
            System.out.println(name);
        }
    }
}
