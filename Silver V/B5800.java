import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();


        for(int i=1;i<=T;i++)
        {
            int N = s.nextInt();
            int []arr = new int[N];
            int gap =0;

            for(int j=0;j<N;j++)
            {
                arr[j] = s.nextInt();
            }
            Arrays.sort(arr);

            for(int j=0;j<N-1;j++)
            {
                gap = Math.max(gap,arr[j+1] - arr[j]);
            }
            System.out.println("Class "+i);
            System.out.println("Max "+arr[N-1]+", Min "+arr[0]+", Largest gap "+gap);
        }
    }
}
