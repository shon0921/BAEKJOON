package Bronze I;

import java.util.Scanner;

public class B1110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int t = n;
        int i = 0;

        while(true) {
            int a = t / 10;
            int b = t % 10;
            t = b * 10 + (a + b) % 10;
            i++;
            if(n == t) {
                break;
            }
        }
        System.out.println(i);
    }
}
