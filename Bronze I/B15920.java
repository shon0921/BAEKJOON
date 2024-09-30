import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();        // 문자열 길이

        String S = s.next();        // 문자열

        int k = 1;      // 현재 위치
        boolean r = true;   // true 5개 flase 1개 기본
        boolean m = false;  // B구역에서 당겼을 경우


        for(int i=0;i<N;i++)
        {
            String action = S.substring(i, i+1);
            if(k==3)
            {
                break;
            }
            
            if(action.equals("W"))
            {
                k++;
            } else if (action.equals("P")) {
                if(k==2) {
                    m = true;   //멀티트랙현상 발생 무조건 6명 깔림
                } else if (r==true){
                    r = false;
                } else if (r==false) {
                    r = true;
                }
            }
        }

        if(k<3) // 3까지 안왔으니 안깔림
        {
            System.out.println("0");
        } else if(k==3 && m==true){
            System.out.println("6");
        } else if (k==3 && r==true) {
            System.out.println("5");
        } else {
            System.out.println("1");
        }
    }
}
