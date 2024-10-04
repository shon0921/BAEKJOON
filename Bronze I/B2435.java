import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int K = s.nextInt();
        int []arr = new int[N];
        int sum = -101;

        for(int i=0;i<N;i++)
        {
            arr[i] = s.nextInt();
        }

        for (int i=0;i<N+1-K;i++)
        {
            int sum2 = 0;
            for(int j=i;j<i+K;j++)
            {
                sum2 += arr[j];
            }
            if(sum2>sum)
            {
                sum = sum2;
            }
        }
        System.out.println(sum);
    }
}
