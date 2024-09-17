import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(b.readLine());
        int []arr = new int[N];
        int c =0;
        StringTokenizer s = new StringTokenizer(b.readLine()," ");
        for(int i = 0;i<N;i++)
        {
                arr[i] = Integer.parseInt(s.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(b.readLine());

        s = new StringTokenizer(b.readLine()," ");

        for(int i=0;i<M;i++)
        {
           int num = Integer.parseInt(s.nextToken());

           int in = Arrays.binarySearch(arr,num);

           if(in<0) {
               c=0;
           } else {
               c++;
           }
           System.out.println(c);
           c =0;
        }
    }
}
