import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        String []arr = new String[s.nextInt()];

        for(int i = 0; i<arr.length;i++)
        {
            arr[i] = s.next();

        }
        for(int i = 0; i<arr.length;i++)
        {
            int c =0;
            int sum =0;
            for(int j=0; j<arr[i].length();j++){
                if(arr[i].charAt(j)=='O'){
                    c++;
                    sum+=c;
                } else {
                    c =0;
                }
            }
            System.out.println(sum);
        }
    }
}
