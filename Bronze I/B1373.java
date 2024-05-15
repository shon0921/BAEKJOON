package Other2;

import java.math.BigInteger;
import java.util.Scanner;

public class B1373 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.nextLine();

        BigInteger N = new BigInteger(S,2); //큰정수? 선언하고 문자열 S 2진수로 변환

        String result = N.toString(8); // 큰정수 2진수를 문자열 8진수로 변환

        System.out.println(result);
    }
}
