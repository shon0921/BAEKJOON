import java.util.Scanner;

public class B1789 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long N = s.nextLong();
        int S = 0;
        int count;
        for (count = 1;S<N;count++)
        {
            S+=count;
            if (S>N)
            {
                break;
            }
        }
        System.out.println(count-1);

    }
}
