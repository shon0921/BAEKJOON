import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s =new Scanner(System.in);

        int N = s.nextInt();
        int count =2;
        while (N!=1)
        {
            if (N%count==0)
            {
                N = N/count;
                System.out.println(count);
            } else {
                count++;
            }
        }

    }
}
