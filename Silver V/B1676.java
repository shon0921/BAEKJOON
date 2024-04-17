package Test;

import java.util.Scanner;

public class B1676 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int c=0;

        while (num>=5)
        {
            c += num /5;
            num /=5;
        }
        System.out.println(c);
    }
}
