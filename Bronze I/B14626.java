import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ISBN = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < ISBN.length(); i++) {

            char c = ISBN.charAt(i);

            if(Character.isDigit(c) && i % 2 == 0) { // 1 2 3 4 5 6
                int a = Integer.parseInt(Character.toString(c));
                sum += a;
            } else if(Character.isDigit(c) && i % 2 != 0) {
                int b = Integer.parseInt(Character.toString(c));
                b *= 3;
                sum += b;
            }
        }

        int count = 0;
        while (true) {
            int sum2 = count;
            if (ISBN.indexOf('*') % 2 != 0) {
                sum2 *=3;
            }
            if ((sum + sum2) % 10 == 0)
            {
                break;
            }
            count++;
        }
        System.out.println(count);

    }
}
