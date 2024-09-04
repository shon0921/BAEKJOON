import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        boolean a = true;   // 푸앙차례
        int count = 1;

        while (true) {
            if(a==true && N-count>=0)
            {
                N = N-count;
                a =false;
                count++;
            } else if (a==false && N-count>=0) {
                N = N-count;
                a = true;
                count++;
            } else {
                break;
            }
        }

        if (a==true)
        {
            System.out.println(count-N);
        } else {
            System.out.println("0");
        }
    }
}
