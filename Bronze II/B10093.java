import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        if (A.compareTo(B)>0)
        {       // A가 더 클경우
            BigInteger C = A;
            A = B;
            B = C;
        }

        if(A.equals(B)) //  같으면 0 출력
        {
            System.out.println("0");
            System.out.println();
        } else {
            BigInteger C = B.subtract(A);
            System.out.println(C.subtract(new BigInteger("1")));
            while(true)
            {
                C = B.subtract(new BigInteger("1"));
                if(A.equals(C))
                {
                    break;
                }
                A = A.add(new BigInteger("1"));
                System.out.print(A+" ");
            }
        }
    }
}
