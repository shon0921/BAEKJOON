import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String y = s.next();
        for(char a= 'a'; a<='z'; a++)
        {
            System.out.print(y.indexOf(a)+" ");
        }
    }
}
