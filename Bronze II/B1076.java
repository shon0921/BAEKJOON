import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long num;
        long sum = 0;

        for(int i=1;i<=3;i++)
        {
            num = 0;
            String S = s.next();

            switch (S)
            {
                case "black" :
                    num += 0;
                    break;
                case "brown" :
                    num += 1;
                    break;
                case "red" :
                    num += 2;
                    break;
                case "orange" :
                    num += 3;
                    break;
                case "yellow" :
                    num += 4;
                    break;
                case "green" :
                    num += 5;
                    break;
                case "blue" :
                    num += 6;
                    break;
                case "violet" :
                    num += 7;
                    break;
                case "grey" :
                    num += 8;
                    break;
                case "white" :
                    num += 9;
                    break;
            }
            if(i==1)
            {
                num=num*10;
                sum +=num;
            } else if (i==2) {
                sum+=num;
            } else {
                long k=1;
                for(int j=0;j<num;j++)
                {
                    k=k*10;
                }
                sum = sum*k;
            }

        }
        System.out.println(sum);

    }
}
