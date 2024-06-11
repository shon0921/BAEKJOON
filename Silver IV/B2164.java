import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>(); // 큐 선언
        int N = s.nextInt();
        for(int i =1; i<= N; i++)
        {
            q.offer(i); // 큐 생성
        }
        while (q.size()>1){ //큐가 1개 남을때까지 반복
            q.poll(); // 맨앞 버리기
            q.offer(q.poll()); // 맨 앞 버리고 바로 뒤에 넣기
        }
        System.out.println(q.poll()); // 마지막 출력
    }
}
