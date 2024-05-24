package Other2;

import java.util.Scanner;

public class B15881 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int a = s.nextInt();
        String S = s.next();
        int answer = 0;

        for(int i=0;i<a;i++){
            if(S.charAt(i) == 'p' && i+3<a){
                if(S.substring(i,i+4).equals("pPAp")) {
                    answer++;
                    i+=3;
                }
            }
        }
        System.out.println(answer);

    }
}
