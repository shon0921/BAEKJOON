import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        int N = s.nextInt();
        HashMap<Long, Integer> H = new HashMap<>(); //해시맵 선언

        int max = 0;
        long x = 0;
        for(int i=0;i<N;i++)
        {
            long card = s.nextLong();

            H.put(card, H.getOrDefault(card, 0)+1); // 해시맵에 롱 값 넣고, 중복값 있으면 +1;

            if(H.get(card) > max) {
                max = H.get(card);
                x = card;
            } else if (H.get(card) == max){
                x = Math.min(x,card);       // 최대 횟수가 값으면 최소값으로
            }
        }
        System.out.println(x);
    }
}
