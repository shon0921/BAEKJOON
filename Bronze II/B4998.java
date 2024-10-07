import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {       // 타이핑 안하면 탈출

            double N = s.nextDouble();      //  저금한 돈 (현재돈)
            double B = s.nextDouble();      // 1년 마다 이자
            double M = s.nextDouble();      // 목표 돈
            int count = 0;

            while (N<M)
            {
                N += N * (B/100);
                count++;
            }
            System.out.println(count);

        }
        s.close();
    }
}
