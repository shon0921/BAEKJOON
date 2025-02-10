import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for(int i=0;i<a;i++)
        {
            int c1 = 0;
            String d1="";
            int b = s.nextInt();
            for(int j = 0;j<b;j++)
            {
                int c2 = s.nextInt();
                String d2 = s.next();

                if(c1<c2)
                {
                    c1 = c2;
                    d1 = d2;
                }
            }
            System.out.println(d1);
        }

    }
}
