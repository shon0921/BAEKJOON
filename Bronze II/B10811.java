import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int k=1;k<=N;k++)
        {
            list.add(k);
        }

        for(int k=0;k<M;k++)
        {
            int i = s.nextInt();
            int j = s.nextInt();
            Collections.reverse(list.subList(i-1,j));
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
