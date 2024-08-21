import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s =new Scanner(System.in);

        int A = s.nextInt();    // 1 시간 마다 쌓이는 피로도
        int B = s.nextInt();    // 1 시간동안 일 처리량
        int C = s.nextInt();    // 1 시간 쉬면 줄어드는 피료도
        int M = s.nextInt();    // 최대 제한 피로도

        int j=0;    // 현재 피로도
        int sum =0; // 일처리량
        int i =0;
        while (i != 24)
        {
            if (j + A <= M)
            {
                j+=A;
                sum += B;
            } else {
                j -= C;
                if(j < 0){
                    j=0;
                }
            }
            i++;
        }
        System.out.println(sum);
    }
}
