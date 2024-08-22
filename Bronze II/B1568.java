import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s =new Scanner(System.in);

        int N = s.nextInt();

        int i = 1;
        int count =0;
        while (N!=0)
        {
                if(N-i>=0)
                {
                    N -= i;
                    i++;
                    count++;
                } else {
                    i = 1;
                }
        }
        System.out.println(count);
    }
}
