package Bronze I;

import java.util.Scanner;

public class B2748 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        long a = 0;
        long b = 1;
        int c;
        long sum =0;

        if(n==0)
        {
            sum = a;
        } else if (n==1)
        {
            sum = b;
        }
        else
        {
            for(int i = 2; i<=n;i++)
            {
                sum = a + b;
                a = b;
                b = sum;
            }
        }
        System.out.println(sum);
    }
}
