import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int M = Integer.parseInt(strs[1]);
        int [][]arr = new int[N][M];
        int count = 0;
        for(int i =0;i<N;i++)
        {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int j = 0;j<M;j++)
            {
                arr[i][j]= Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 1;i<N;i++)
        {
            int sum = 0;
            int num;
            for (int j = 0;j<M;j++)
            {
                if (arr[0][j] > arr[i][j]){
                    num = arr[0][j] - arr[i][j];
                } else {
                    num = arr[i][j] - arr[0][j];
                }
                sum += num;
            }
            if (sum>2000)
            {
                count++;
            }
        }
        if ((N - 1) % 2 == 0) {
            if (count >= (N - 1) / 2) {
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        } else {
            if (count >= (N - 1) / 2 + 1) {
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        }
        bf.close();
    }
}
