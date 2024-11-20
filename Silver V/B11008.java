import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();      
        for(int i=0;i<N;i++)
        {
            int count = 0;
            String a = s.next();
            String b = s.next();

            while (a.contains(b))
            {
                a = a.replaceFirst(b,"");
                count++;
            }
            count+=a.length();
            System.out.println(count);
        }
    }
}
