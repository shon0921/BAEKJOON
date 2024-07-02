import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<T;i++)
        {
            String S = s.next();
            switch (S) {

                case "push" :
                    stack.push(s.nextInt());
                    break;
                case "pop" :
                    if(stack.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                case "size" :
                    System.out.println(stack.size());
                    break;
                case "empty" :
                    if (stack.empty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    } break;
                case "top" :
                    if (stack.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.peek());
                    } break;
            }
        }
    }
}
