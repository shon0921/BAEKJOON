import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = "A";
        int m;
        int count = 0;
        while (true) {
            int o = s.nextInt();    //적정 체중
            int w = s.nextInt();    //실제 체중
            count++;
            if(o==0&&w==0)
            {
                break;
            }
            while (true) {
                S = s.next();
                m = s.nextInt();
                if(w<1)
                {
                    m=0;
                }
                switch (S) {
                    case "E":
                        w = w - m;
                        break;
                    case "F":
                        w = w + m;
                        break;
                    case "#":
                        if (w > o / 2 && w < o * 2) {
                            System.out.println(count+" :-)");
                            break;
                        } else if (w < 1) {
                            System.out.println(count+" RIP");
                            break;
                        } else {
                            System.out.println(count+" :-(");
                            break;
                        }

                }
                if(S.equals("#"))
                {
                    break;
                }
            }
        }
    }
}
