import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int []arr = new int[10];

        for (int i=0;i<arr.length;i++)
        {
            arr[i] = s.nextInt();
        }

        int sum1 = 0;
        int sum2 = 0;
        int count = 0;
        int num=0;

        while (true)
        {
            sum1 += arr[count];
            if(sum1>100)
            {

                if(Math.abs(sum1-100) > Math.abs(sum2-100))
                {
                    num = sum2;
                } else {
                    num = sum1;
                }
                break;
            } else if (count>8) {
                num = sum1;
                break;
            }

            sum2 = sum1;

            count++;
        }
        System.out.println(num);
    }
}
