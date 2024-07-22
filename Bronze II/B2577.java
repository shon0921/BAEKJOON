import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c;
        int sum;
        
        Scanner num = new Scanner(System.in);
        a = num.nextInt();
        b = num.nextInt();
        c = num.nextInt();

        sum = a*b*c;
        num.close();

        int[] counts = new int[10];
        while (sum > 0) {
            counts[sum % 10]++;
            sum /= 10;
        }
        for (int i=0; i < counts.length; ++i) {
            System.out.println(counts[i]);
        }
    }
}
