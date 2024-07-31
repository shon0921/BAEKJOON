import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s =new Scanner(System.in);

        String W = s.next();
        int N = s.nextInt();

        int [][]arr = new int[N][N];
        String [][] arr2 = new String[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                arr[i][j] = s.nextInt();
                if (arr[i][j]==2){
                    arr2[i][j]="5 ";
                } else if (arr[i][j]==5) {
                    arr2[i][j]="2 ";
                } else if (arr[i][j]==1){
                    arr2[i][j]="1 ";
                } else if(arr[i][j]==8) {
                    arr2[i][j]="8 ";
                } else {
                    arr2[i][j]="? ";
                }
            }
        }

        switch (W) {
            case "L": case "R":
                for (int i=0;i<N;i++)
                {
                    for (int j =N-1;j>=0;j--)
                    {
                        System.out.print(arr2[i][j]);
                    }
                    System.out.println();
                } break;
            case "U": case "D":
                for (int i = N - 1; i >= 0; i--) {
                    for (int j = 0; j < N; j++) {
                        System.out.print(arr2[i][j]);
                    }
                    System.out.println();
                } break;
        }
    }
}
