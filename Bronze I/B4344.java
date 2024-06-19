import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int C = s.nextInt(); // 테스트 케이스 입력
        int[] arr;
        double sum;
        double avg = 0;
        double sum2 = 0;

        for(int i =0; i<C;i++)
        {
            int A = s.nextInt(); // 학생 수 입력

            arr = new int[A];
            sum = 0;
            for (int j = 0; j<A;j++) // 학생 점수 입력
            {
                arr[j] = s.nextInt();
                sum += arr[j];
            }
            avg=sum/A;  // 평균 생성
            for (int k =0; k<A;k++)
            {
                if (arr[k]>avg)
                {
                    sum2++;
                }
            }
            sum = (sum2/A)*100;
            System.out.printf("%.3f%%\n",sum);
            sum2 = 0;
        }
    }
}
