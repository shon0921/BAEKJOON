package Other2;

import java.util.Scanner;

public class B4796 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int P = 1;
        int L = 1;
        int V = 1;
        int i = 1;
        int sum;
        while (true)
        {
            L = s.nextInt();
            P = s.nextInt();
            V = s.nextInt();

            if (V==0)
            {
                break;
            }
            sum = L*(V/P)+Math.min(L,(V%P));

            System.out.println("Case "+i+": "+ sum);
            i++;
        }
    }
}
