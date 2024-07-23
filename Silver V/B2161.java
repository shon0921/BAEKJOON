import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int N = s.nextInt();
        for(int i=1;i<=N;i++)
        {
            q.offer(i);
        }
        while (q.size()>1){
            System.out.print(q.poll()+" ");
            q.offer(q.poll());
        }
        System.out.print(q.poll());
    }
}
