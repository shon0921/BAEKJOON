package Silver V;

import java.util.Scanner;

public class B1312 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();
        int N = s.nextInt();
        int sum;
        int num = A%B;

        for (int i = 0; i < N-1; i++) {
            num *= 10;
            num %= B;
        }
        num *= 10;
        System.out.print(num/B);
        s.close();
    }
}
