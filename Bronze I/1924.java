package Bronze I;

import java.util.Scanner;

// 월을 x 일을 y로 선언할것
public class 1924 {
    public static void main(String[] args) {
        int [] dayx  = {31,28,31,30,31,30,31,31,30,31,30,31};
        String [] dayy = {"SUN","MON", "TUE", "WED", "THU", "FRI", "SAT"} ;
        Scanner s = new Scanner(System.in);
        System.out.println("월 일 입력");
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int sum =0;
        for (int i =0 ; i<n1-1 ;i++) {    //이전 월 전부 더하기
            sum += dayx[i];
        }
        sum+=n2; // 현재 일 더하기

        System.out.println(dayy[sum%7]);
    }
}
