import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();

            if (s.equals("."))
            {
                break;
            }
            Stack<Character> stack = new Stack<>();
            boolean flag = true;

            for (int j = 0; j < s.length(); j++) {

                char c = s.charAt(j);

                if (c == '(' || c == '[') {
                    stack.push(c);
                    flag = false;
                }else if (c == ')' && (stack.isEmpty() || stack.peek() == '[')) {
                    flag = false;
                    break;
                } else if (c == ']' && (stack.isEmpty() || stack.peek() == '(')) {
                    flag = false;
                    break;
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (stack.empty()) {
                    flag = true;
                }

            }
            if (stack.empty() && flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
