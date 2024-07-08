import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        long sum = 5;
        long sum2 = 7;

        if(N==1){
            System.out.println(sum);
        } else if (N==2) {
            System.out.println(sum+sum2);
        } else {
            for (int i=2;i<=N;i++)
            {
                sum+=sum2;
                sum2+=3;

            }
            System.out.println(sum % 45678);
        }
    }
}
