import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    int d = s.nextInt();
    int e = s.nextInt();
    int f = s.nextInt();
    
    for(int x=-999; x<=1000; x++){
        for(int y=-999; y<=1000; y++){
            if(a*x+b*y == c){
                if(d*x+e*y == f){
                    System.out.println(x + " " + y);
                }
            }
        }
      }
    }
}
