import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int K = s.nextInt();
        int sum=0;
        for(int i=0;i<K;i++)
        {
            int n = s.nextInt();

            if(n==0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }
        for (int num : stack){
            sum+=num;
        }
        System.out.println(sum);
    }
}
