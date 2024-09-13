import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<T;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            switch (S) {

                case 1 :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2 :
                    if(stack.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                case 3 :
                    System.out.println(stack.size());
                    break;
                case 4 :
                    if (stack.empty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    } break;
                case 5 :
                    if (stack.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.peek());
                    } break;
            }
        }
    }
}
