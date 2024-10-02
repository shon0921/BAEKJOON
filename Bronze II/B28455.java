import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int lv = 0;
        int sum = 0;

        int []arr = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);

        int j = N-1;
        int k;
        if(N>42) {
            k=N-42;
        } else {
            k=0;
        }
        for (int i = j; i>=k; i--) {
            lv += arr[i];
            if (arr[i] >= 250) {
                sum += 5;
            } else if (arr[i] >= 200) {
                sum += 4;
            } else if (arr[i] >= 140) {
                sum += 3;
            } else if (arr[i] >= 100) {
                sum += 2;
            } else if (arr[i]>=60){
                sum += 1;
            }
        }
        System.out.println(lv+" "+sum);
    }
}
