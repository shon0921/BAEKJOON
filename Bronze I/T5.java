package Ch6;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        double num2=0; // 최댓값
        int num = s.nextInt(); //평균 갯수
        double [] arr = new double[1000]; //배열 선언
        double sum,sum2=0; // 합계

        //점수 / 최고점수*100
        for(int j=0;j<num;j++)
        {
            arr[j] = s.nextDouble();
            if (num2<arr[j])
            {
                num2 = arr[j];
            }
        }
        for (int j=0;j<num;j++) {
            sum = (arr[j] / num2) * 100;
            sum2 += sum;
        }
        sum2 = sum2/num;    // 평균
        System.out.println(sum2);
    }
}
