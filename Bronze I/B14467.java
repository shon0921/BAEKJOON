import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int count = 0 ;
        int []arr = new int[11];

        Arrays.fill(arr, 2);

        for(int i=0;i<N;i++)
        {
            int a = s.nextInt();
            int b = s.nextInt();

            if(arr[a]==2)
            {
                arr[a] = b;
            } else if(arr[a]!=2&&arr[a]!=b){
                count++;
                arr[a] = b;
            } else {
                arr[a]=b;
            }

        }
        System.out.println(count);
    }
}
