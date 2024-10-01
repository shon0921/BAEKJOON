import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int K = s.nextInt();    // 만들어야할돈
        int money = 0;  // 현재 돈
        int count = 0;  //카운트
        int []arr = new int[N];

        for(int i=0;i<N;i++)
        {
            arr[i] = s.nextInt();
        }


        while (money < K) {
            // 큰 동전부터 사용
            for (int i = N - 1; i >= 0; i--) {
                // 동전을 추가해도 목표 금액을 넘지 않는 경우
                if (arr[i] + money <= K) {
                    money += arr[i];  // 동전을 사용
                    count++;          // 동전 사용 횟수 증가
                    break;            // 다시 큰 동전부터 체크하기 위해 빠져나옴
                }
            }
        }


        System.out.println(count);
    }
}
