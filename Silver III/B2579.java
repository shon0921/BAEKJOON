import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   // 계단 수
        int[] b = new int[a];   // 계단 배열

        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();

        if (a == 1) {
            System.out.println(b[0]);
            return; // 여기서 함수 실행을 종료
        } else if (a == 2) {
            System.out.println(b[0] + b[1]);
            return; // 여기서 함수 실행을 종료
        }

        // 이 아래 코드는 a가 3 이상일 때만 실행
        int[] dp = new int[a];
        dp[0] = b[0];
        dp[1] = b[0] + b[1];
        dp[2] = Math.max(b[0] + b[2], b[1] + b[2]);

        for (int i = 3; i < a; i++) {
            dp[i] = Math.max(dp[i-2] + b[i], dp[i-3] + b[i-1] + b[i]);
        }

        System.out.println(dp[a-1]);  // 마지막 계단까지의 최댓값
    }
}
