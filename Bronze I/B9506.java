import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s =new Scanner(System.in);

        int n = 0;
        while (true)
        {
            n = s.nextInt();
            if(n==-1)
            {
                break;
            }
            int [] arr = new int[n];
            int sum = 0;
            for(int i=1;i<=n;i++)
            {
                if (n % i ==0 && i != n)
                {
                    arr[i] =i;
                    sum+=i;
                }
            }

            if (sum != n) {
                System.out.print(n+" is NOT perfect.");
            } else {
                System.out.print(n+" = 1");
                for(int i =1;i<=n;i++)
                {
                    if(arr[i-1] !=0 && arr[i-1]!=1) {
                        System.out.print(" + "+arr[i-1]);
                    }
                }
            }
            System.out.println();
        }
    }
}
