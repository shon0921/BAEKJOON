import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        HashSet<Integer> h =new HashSet<Integer>(); // 해시셋 선언

        for(int i=0;i<10;i++)
        {
            h.add(s.nextInt() % 42);
        }
        System.out.println(h.size());
    }
}
