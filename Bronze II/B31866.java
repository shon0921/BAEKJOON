import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        
        if(A==B)
        {
            System.out.println("=");
        } else if (A==0&&B!=5) {
            System.out.println(">");
        } else if (A==2&&B!=0) {
            System.out.println(">");
        } else if (A==5&&B!=2) {
            System.out.println(">");
        } else if (A!=5&&B==0) {
            System.out.println("<");
        } else if (A!=2&&B==5) {
            System.out.println("<");
        } else if (A!=0&&B==2) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }
    }
}
