import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int num = 1;
        int M = s.nextInt();
        int count = 0;

        while (N+1!=num)
        {
            if(num%10==M)    //일의 자리 계상
            {
                count++;

            }

            if(num>9 && (num/10)%10==M)    // 십의 자리 계산
            {
                count++;

            }
            if (num>99 && (num/100)%10==M) // 백의 자리 계산
            {
                count++;

            }

            if (num>999 && (num/1000)%10==M) // 천의 자리 계산
            {
                count++;
            }

            if (num>9999 && (num/10000)%10==M) // 만의 자리 계산
            {
                count++;
            }
            if (num>99999 && (num/100000)%10==M) // 십만의 자리 계산
            {
                count++;
            }
            num++;

        }
        System.out.println(count);
    }
}
