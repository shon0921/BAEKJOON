package Test;

import java.util.Scanner;

public class B1402 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        int T = s.nextInt();

        for (int i =0; i <T;i++) {
            int A = s.nextInt();
            int B = s.nextInt();

            System.out.println("yes");
        }

        //첫 번째 수는 곱한 값 두번째 수는 합한 값이고 둘다 수가 같아야한다
        // 예 6= 2*3, 2+3=5 2하고 3이 들어감
        //하지만 첫번째 수에다가 1,-1두개로 필요한 곱하는걸로 마음대로 수를 정할수 있어서
        // 뭘해도 no가 나오지 않는다(무조건 참)
    }
}
