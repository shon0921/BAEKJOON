package Test;

import java.util.Scanner;

public class B9656 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        if(N%2==0)
        {
            System.out.println("SK");
        }
        else
        {
            System.out.println("CY");
        }
    }
}
