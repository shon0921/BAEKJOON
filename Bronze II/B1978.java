import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int count = 0;

        for(int i =0; i<N;i++){
            int n = s.nextInt();

            for(int j = 2; j<=n; j++){
                if(j==n){
                    count++;
                } else if (n%j==0){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
