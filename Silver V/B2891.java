import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();    //팀수
        int S = s.nextInt();    // 카약이 손상된 팀의 수
        int R = s.nextInt();    // 카약을 하나 더 가져온 팀의 수
        int result =0;

        int []arr = new int[N+1];   //0번은 제외
        Arrays.fill(arr, 0);
        for(int i=0;i<S;i++)
        {
            int a = s.nextInt();
            arr[a] -- ; //손상 (-1)
        }

        for (int i=0;i<R;i++)
        {
            int a = s.nextInt();
            arr[a] ++ ; // 하나 더
        }

        for(int i=1;i<N;i++)
        {
            if(arr[i] == -1 && arr[i+1] ==1)
            {
                arr[i]++;
                arr[i+1]--;
            } else if (arr[i+1]==-1 && arr[i]==1) {
                arr[i+1]++;
                arr[i]--;
            }
        }
        for(int i=1;i<N+1;i++) {
            if(arr[i]==-1) {
                result++;
            }
        }
        System.out.println(result);
    }
}
