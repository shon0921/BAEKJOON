package Silver V;

import java.util.Scanner;

public class 1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int stick = 64;
        int c = 0;

        while (X>0)
        {
            if (stick>X)
            {
                stick/=2;
            }
            else
            {
                c++;
                X-=stick;
            }
        }
        System.out.println(c);

    }
}

