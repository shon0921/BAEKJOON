import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();

        int []arr = new int[N];

        for(int i=0;i<N;i++)
        {
            arr[i] = s.nextInt();
        }


        Arrays.sort(arr);

        for(int i=0;i<N;i++)
        {

            if(M>=arr[i])
            {
                M++;

            }
        }
        System.out.println(M);
    }
}
