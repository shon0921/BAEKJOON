import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        double sum = 0;


        for(int i=0;i<N;i++)
        {
            int a = s.nextInt();


            if(a<100)   // 100점이 아니면
            {
                if(a>9){    // 10점 미만이면 십의 자리 변경 안함
                    if ((a/10)%10 == 6)   // 십의 자리 변경
                    {
                        a = (a%10)+90;
                    }
                }
                if(a%10==0||a%10==6) // 일의 자리 변경
                {

                    int b = a%10;
                    a = a-b;
                    a = a+9;
                }
            }
            sum+=a;

        }

        sum = sum/N;
        long sum2 = Math.round(sum);    // 반올림 후 형변환

        System.out.println(sum2);
    }
}
