import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int count = 0;
        int temp = 0;
         while(true){
             if(N%5 == 0){
                    count += N/5;
                 System.out.println(count);
                 break;
             }else{
                 N -= 2;
                 count++;
             }
             if(N < 0){
                 System.out.println(-1);
                 break;
             }
         }
    }
}
