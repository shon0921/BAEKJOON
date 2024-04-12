package Bronze I;

import java.util.Scanner;

public class 1037 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A,N;
        A = s.nextInt();    //약수 갯수
        int i = 0;  //카운트
        int [] arr = new int[50];
        while (true)
        {
            arr[i] = s.nextInt(); //약수
            i++;
            if(i==A)
            {
                break;
            }
        }

        int max = 0,min = 1000000; //최댓값 최솟값 선언

        for (int j = 0;j<i;j++)
        {
            if(arr[j]>max)
            {
                max = arr[j];
            }

            if (arr[j]<min)
            {
                min = arr[j];
            }
        }
        System.out.println(max*min);
    }
}
