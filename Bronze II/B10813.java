import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        int M = sc.nextInt();
        int temp;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;                    
        }                                       
        for(int j = 0; j < M; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            temp = arr[a-1];
            arr[b-1] = arr[a-1];
            arr[b-1] = temp;
        }
        for(int k = 0; k <arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
