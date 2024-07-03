import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int sum =0;
        while (N>0)
        {
            if(N%5 ==0)
            {
                sum+= N/5;
                break;
            } else {
                N-= 3;
                sum++;
            }
            if(N<0){
                sum = -1;
            }
        }
        System.out.println(sum);
    }
}
