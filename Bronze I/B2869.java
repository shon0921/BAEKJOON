import java.util.Scanner;

public class B2869 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int up = in.nextInt();		// A
        int down = in.nextInt();	// B
        int length = in.nextInt(); 	// C

        int day = (length - down) / (up - down); // 총길이 - 내려갈 길이
                                                 // 올라갈 길이 - 내려갈길이

        // 나머지가 있을 경우
        if ((length - down) % (up - down) != 0) { // 나머지가 있으면 하루 추가함
            day++;
        }
        System.out.println(day);
    }
}
