package Test;

import java.math.BigInteger;
import java.util.Scanner;

public class B10826 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        int n = s.nextInt();

        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("0");

        if(n==0)
        {
            System.out.println("0");
        } else if (n == 1) {
            System.out.println("1");
        } else {

            for (int i = 2; i<=n;i++)
            {
                c = a.add(b);
                a = b;
                b = c;
            }
            System.out.println(c);
        }
    }
}
