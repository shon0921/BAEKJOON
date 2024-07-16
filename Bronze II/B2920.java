import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int []arr = new int[8];
        int num = 7;

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = s.nextInt();
        }

        if(arr[0]==1)
            for (int i = 1; i < arr.length; i++) {
                if (i+1 != arr[i]) {
                    System.out.println("mixed");
                    break;
                }
                if (i == 7) {
                    System.out.println("ascending");
                }
            }
        else if (arr[0]==8) {
            for (int i=1;i<arr.length;i++)
            {
                if(num!=arr[i]) {
                    System.out.println("mixed");
                    break;
                }
                if(i==7){
                    System.out.println("descending");
                }
                num--;
            }

        } else {
            System.out.println("mixed");
        }
    }
}
