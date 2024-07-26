import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);

        while (true) {

            long G = s.nextInt(); //그룹의 수
            long T = s.nextInt(); //그룹 구성 팀수
            long A = s.nextInt();    //토너먼트 진출 팀 수
            long D = s.nextInt();    //바로 토너먼트 진출
            long X = 0;
            long Y = 0;
            long max = 1;
            if(G ==-1&&T==-1&&A==-1&&D==-1){
                break;
            }
            while(max<A*G+D)
            {
                max*=2;
            }
            long t = G*A+D;
            Y = max - t;            //토너먼트 추가 팀
            X = (T*(T-1))/2;        // 토너먼트 가기 전까지 총 경기수
            X = X * G + t+Y - 1;    // 총 경기수
            System.out.println(G+"*"+A+"/"+T+"+"+D+"="+X+"+"+Y);
        }
    }
}
