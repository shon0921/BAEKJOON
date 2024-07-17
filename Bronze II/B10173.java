import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String NEMO = "NEMO";
        while(true)
        {
            String S=s.nextLine();
            if(S.equals("EOI"))
            {
                break;
            } else {
                S = S.toUpperCase();
                if(S.contains(NEMO)) {
                    System.out.println("Found");
                } else {
                    System.out.println("Missing");
                }
            }
        }
    }
}
