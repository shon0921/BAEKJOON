import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//큐 구현 백준에서는 시간초과로 인해 별도로 제출
public class C {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();
        int num = 0;

        for(int i=0;i<n;i++)
        {
            String S = s.next();
            switch (S) {
                case "push" : //정수 X를 큐에 넣는 연산
                    num = s.nextInt();
                    q.offer(num);
                    break;
                case "pop" : //큐에서 가장 앞에 있는 정수를 빼고,그 수를 출력 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력
                       if(q.isEmpty()){
                           System.out.println("-1");
                       } else {
                           System.out.println(q.poll());
                       }
                        break;
                case  "size" :  //큐에 들어있는 정수의 개수를 출력
                    System.out.println((q.size()));
                    break;
                case  "empty" : //큐가 비어있으면 1, 아니면 0을 출력
                    if(q.isEmpty()){
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case  "front" : //큐의 가장 앞에 있는 정수를 출력, 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력
                    if(q.isEmpty()){
                        System.out.println("-1");
                    } else {
                        System.out.println(q.peek());
                    }
                    break;
                case  "back" : //큐의 가장 뒤에 있는 정수를 출력 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력
                    if(q.isEmpty()){
                        System.out.println("-1");
                    } else {
                        System.out.println(num);
                    }
                    break;
            }
        }
    }
}
