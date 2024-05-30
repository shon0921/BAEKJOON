import java.util.Scanner;

public class B24228 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        long N = s.nextLong();
        long R = s.nextLong();

        System.out.println(N+1+2*(R-1));
    }
}
