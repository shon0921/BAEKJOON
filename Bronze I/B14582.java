import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int []arr = new int[9];
        int []arr2 = new int[9];
        int sum = 0;
        int sum2 = 0;
        int win = 0;

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = s.nextInt();
        }

        for(int i=0;i<arr2.length;i++)
        {
            arr2[i] = s.nextInt();
        }

        for(int i=0;i<9;i++)
        {
            sum+=arr[i];
            if(sum>sum2)
            {
                win++;
            }
            sum2+=arr2[i];
            if(sum>sum2)
            {
                win++;
            }

        }
        if (win>0)
        {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
