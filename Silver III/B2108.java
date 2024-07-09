import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i<N;i++)
        {
            arr[i] = s.nextInt();
        }

        double sum1 =0;
        for(int i = 0;i<N;i++){
            sum1+= arr[i];
        }
        sum1=sum1/N;
        System.out.println(Math.round(sum1));

        Arrays.sort(arr);

        int ocount = 0;
        int max = 10000;
        boolean flag = false;

        for(int i =0; i<N; i++)
        {
            int count = 1;
            int jump = 0;
            int value = arr[i];

            for(int j=i+1;j<N;j++)
            {
                if(value != arr[j])
                {
                    break;
                }
                count++;
                jump++;
            }

            if(count > ocount) {
                ocount = count;
                max = value;
                flag = true;
            } else if (count == ocount && flag == true) {
                max = value;
                flag = false;
            }
            i += jump;
        }

        System.out.println(arr[N/2]);
        System.out.println(max);
        System.out.println(arr[N-1]-arr[0]);
    }
}
