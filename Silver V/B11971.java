import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();        
        int M = s.nextInt();
        int []arr = new int[100];    //1km 구간마다 제한속도 
        int over = 0;                // 초과 최고 속도

        int count=0;    // 구간 카운트용

        for (int i=0;i<N;i++)
        {
            int S = s.nextInt();
            int speed = s.nextInt();
            while (S!=0)
            {
                arr[count] = speed;
                count++;
                S--;
            }
        }
        count=0;
        for (int i=0;i<M;i++)
        {
            int r = s.nextInt();    // 도로 길이
            int speed = s.nextInt();    //속도

            while (r!=0)
            {
                if(speed-arr[count]>over) {
                    over=speed-arr[count];
                }
                count++;
                r--;
            }

        }
        System.out.println(over);
    }
}
