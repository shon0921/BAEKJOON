import java.util.Scanner;

public class B11557 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        String S;
        String Sr = "a";
        int L;
        int Lr = -1;
        int N;

        for (int i =0;i<T;i++)
        {
            N = s.nextInt();

            for (int j = 0; j < N ; j++)
            {
                S = s.next();
                L = s.nextInt();

                if(L>Lr)
                {
                    Sr = S;
                    Lr = L;
                }
            }
            System.out.println(Sr);
            Lr = -1;

        }
    }
}
