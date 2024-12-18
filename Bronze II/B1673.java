import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
      
        while(s.hasNextInt()){
            int n = s.nextInt();
            int k = s.nextInt();
            int temp = n, a= 0;
            while(temp >= k){
                a += temp / k;
      
                temp = temp/k + temp%k;
            }
            System.out.println(n+a);    
        }
    }
}
