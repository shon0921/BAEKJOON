import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long N= s.nextLong();

        if(N%2==0)
        {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}
