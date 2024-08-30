import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        int[][] arr = new int[N][2];    //생성

        for (int i=0;i<N;i++)
        {
            arr[i][0] = s.nextInt();    // x 입력
            arr[i][1] = s.nextInt();    // y 입력
        }

        Arrays.sort(arr,(e1, e2)->{     // 람다식 사용 e1, e2 값을 받음
            if (e1[0] == e2[0])         // comparator 사용
            {
                return e1[1] - e2[1];   // 둘이 x값 같으면 음수 값 먼저 나옴
            } else {
                return e1[0] - e2[0];   
            }
        });

        for(int i=0; i<N; i++){
            System.out.println(arr[i][0]+ " " + arr[i][1]);
        }

    }
}
