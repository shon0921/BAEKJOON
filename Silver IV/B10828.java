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

                case "push" :                // 스택 값 넣기
                    stack.push(s.nextInt());
                    break;
                case "pop" :                //  스택 가장 위에있는 값 빼기
                    if(stack.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                case "size" :                // 스택 크기 출력
                    System.out.println(stack.size());
                    break;
                case "empty" :                //스택 비어 있으면 1 아니면 0
                    if (stack.empty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    } break;
                case "top" :                //스택 가장 위에 있는 값 출력
                    if (stack.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.peek());
                    } break;
            }
        }
    }
}
