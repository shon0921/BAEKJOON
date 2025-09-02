import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (true)
        {
            if(y>x)
            {
                x+=a;
            } else if (x>y){
                y+=b;
            } else{
                break;
            }
            if(x>10000||y>10000) {
                x = -1;
                break;
            }
        }
        System.out.println(x);
    }
}
