import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int X = s.nextInt();
        int Y = s.nextInt();

        int X1 = -1;   //기본값
        int X2 = -1;  // 기본값2
        int Y1 = -1;    // 기본값3
        int Y2 = -1;    // 기본값 4

        int sum;    // 합계
        int [][]arr = new int[X][Y]; // x y 좌표

        for(int i = 0;i<X;i++)  // x 일단 다 입력
        {
            for(int j =0; j<Y;j++) // y
            {
                arr[i][j] = s.nextInt();
                if(arr[i][j]==1&&X1==-1)
                {
                    X1 = i;
                    Y1 = j;
                } else if (arr[i][j]==1&&X2==-1) {
                    X2 = i;
                    Y2 = j;
                }
            }
        }
        sum = Math.abs(X2-X1) + Math.abs(Y2-Y1);
        System.out.println(sum);
    }
}
