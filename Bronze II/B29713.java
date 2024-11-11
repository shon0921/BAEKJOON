import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        String M = s.next();
        int count = 0;
        
        int B = 0;  
        int R = 0;  // 2개 필요
        int O = 0;
        int N = 0;
        int Z = 0;
        int E = 0;  // 2개 필요
        int S = 0;
        int I = 0;
        int L = 0;
        int V = 0;
        

        for(int i=0;i<A;i++)
        {
            String Q = String.valueOf(M.charAt(i));
            switch (Q)
            {
                case "B" :
                    B++;
                    break;
                case "R" :
                    R++;
                    break;
                case "O" :
                    O++;
                    break;
                case "N" :
                    N++;
                    break;
                case "Z" :
                    Z++;
                    break;
                case "E" :
                    E++;
                    break;
                case "S" :
                    S++;
                    break;
                case "I" :
                    I++;
                    break;
                case "L" :
                    L++;
                    break;
                case "V" :
                    V++;
                    break;
            }
            if(B>=1&&R>=2&&O>=1&&N>=1&&Z>=1&&E>=2&&S>=1&&I>=1&&L>=1&&V>=1)
            {
                count++;
                B--;
                R-=2;
                O--;
                N--;
                Z--;
                E-=2;
                S--;
                I--;
                L--;
                V--;
            }

        }
        System.out.println(count);
    }
}
