import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        int N = s.nextInt();        // N분간 운동
        int m = s.nextInt();        // 맥박 (초기값, 최소값)
        int X = m;                  // 현재 맥박
        int M = s.nextInt();        // 맥박수 (최대값)
        int T = s.nextInt();        // 운동 맥박수 T만큼 증가
        int R = s.nextInt();        // 휴식 맥박수 R만큼 감소

        int count = 0;  // 행동수
        int Ncount = 0;

        if((M-m)<T){
            count=-1;
        }else {
            while (Ncount<N)
            {
                if(X<m)   //운동 불가능
                {
                    X=m;
                } else if (X+T>M) { //휴식
                    X-=R;
                    count++;
                } else if(X+T<=M){   // 운동
                    X +=T;
                    count++;
                    Ncount++;
                }
               
            }
        }

        System.out.println(count);
    }
}
