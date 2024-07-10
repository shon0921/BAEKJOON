import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();    //카드 수
        int []arr = new int[N];
        int M = s.nextInt();    //최대값
        int sum = 0;

        for(int i=0;i<N;i++)
        {
            arr[i] = s.nextInt();
        }

        for(int i=0;i<N-2;i++)
        {
            if (arr[i]<M)
            {
                for (int j = i+1;j<N-1;j++)
                {
                    if (arr[i]+arr[j]<M)
                    {
                        for (int k = j+1;k<N;k++)
                        {
                            if (arr[i]+arr[j]+arr[k]<=M){
                                if( sum < arr[i]+arr[j]+arr[k]){
                                    sum = arr[i]+arr[j]+arr[k];
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
