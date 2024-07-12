import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();
        long a =0;
        long b =1;
        long a1;

        for(int i =0; i<N; i++)
        {
            a1 = s.nextInt();
            a += a1;
        }
        for(int i =0; i<M; i++)
        {
            a1 = s.nextInt();
            if (a1!=0)
            {
                b *= a1;
            }
        }
        a = a*b;
        System.out.println(a);
    }
}
