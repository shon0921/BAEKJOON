import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s =new Scanner(System.in);

        int N = s.nextInt();
        int H = s.nextInt();
        int count =0;
        int []arr = new int[N];

        for(int i=0;i<N;i++)
        {
            arr[i]=s.nextInt();
        }

        while(H>0)
        {
            H-=arr[count];
            count++;
            if(arr.length==count&&H>0)
            {
                count= -1;
                H=-1;
            }
        }
        System.out.println(count);


    }
}
