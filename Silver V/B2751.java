import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N =s.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i<N;i++)
        {
            list.add(s.nextInt());
        }
        Collections.sort(list);

        for(Integer c : list) {
            sb.append(c).append("\n");
        }
        System.out.println(sb);

    }
}
