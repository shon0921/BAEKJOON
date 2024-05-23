package Test;

import java.util.Scanner;

public class B2609 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int min = 0;    //최대공약수
        int max = 0;    //최소공약수

        for (int j =1; j<=a && j<=b;j++)    //최소공약수 구하기
        {
            if (a%j==0 && b%j==0)   //여기까지
            {
                max = j;
            }
            min = (a*b)/max;    //최소공배수 구하기
        }
        System.out.println(max);
        System.out.println(min);
    }
}
