package Test;

import java.util.Scanner;

public class B11050 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        int N = s.nextInt();
        int K = s.nextInt();

        int sum = 1;
        int b = 1;
        int a;
        int c =1;

        for(int i=1;i<=N;i++)
        {
            sum*=i;
        }
        a = N-K;
        for(int i=1;i<=a;i++)
        {
            b*=i;
        }

        for(int i=1;i<=K;i++)
        {
            c*=i;
        }
        K=b*c;
        sum = sum/K;
        System.out.println(sum);
    }
}
