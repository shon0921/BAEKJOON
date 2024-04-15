package Ch6;

import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int T = s.nextInt();
        int A=0;
        int B=0;
        int max = 0;    //최대공약수
        int min = 0;    //최소공배수

        for (int i =0; i<T;i++) //출력횟수
        {
            A = s.nextInt();
            B = s.nextInt();
            for (int j =1; j<=A && j<=B;j++)    //최소공약수 구하기
            {
                if (A%j==0 && B%j==0)   //여기까지
                {
                    max = j;
                }
                min = (A*B)/max;    //최소공배수 구하기
            }
            System.out.println(min);
        }
    }
}
