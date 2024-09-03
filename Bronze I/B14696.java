import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();    // 최대 라운드 수
        for(int i = 0; i<N;i++)
        {
            int a = s.nextInt();
            int []arr = new int[a]; // A 총 갯수

            for(int j =0; j<arr.length;j++)
            {
                arr[j] = s.nextInt();
            }

            int b = s.nextInt();
            int []arr2 = new int[b]; // B 총 갯수

            for(int j =0; j<arr2.length;j++)
            {
                arr2[j] = s.nextInt();
            }

            while (true)
            {

                int count1 = 0; // A카운트
                int count2 = 0; // B 카운트
                for(int k=4;k>0;k--){

                    for(int v=0;v<arr.length;v++)
                    {
                        if(arr[v]==k)
                        {
                            count1++;
                        }
                        
                    }

                    for(int v=0;v<arr2.length;v++)
                    {
                        if(arr2[v]==k)
                        {
                            count2++;
                        }
                        
                    }
                    if(count1 > count2)
                    {
                        System.out.println("A");
                        break;
                    } else if (count2 > count1){
                        System.out.println("B");
                        break;
                    } else {

                    }
                }
                if(count1==count2)
                {
                    System.out.println("D");
                    break;
                } else {
                    break;
                }
            }
        }
    }
}
