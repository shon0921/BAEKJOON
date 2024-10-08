import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = 1;

        while (true)
        {
            N = s.nextInt();
            double max = -1;
            String S = null;

            String []arr = new String[N];
            double []arr2 = new double[N];
            if(N==0)
            {
                break;
            }
            for(int i=0;i<N;i++)
            {
                arr[i] = s.next();
                arr2[i] = s.nextDouble();

                if(max<arr2[i])
                {
                    max = arr2[i];
                    S = arr[i]+" ";
                } else if (max==arr2[i]) {

                    S = S+arr[i]+" ";
                }
            }
            System.out.println(S);
        }
    }
}
