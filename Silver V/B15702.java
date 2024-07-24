import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int max =0;
        int max2 =0;
        String name ="100001";

        int []arr = new int[N];
        for(int i =0;i<N;i++)
        {
            arr[i] = s.nextInt();
        }
        String []c = new String[N+1];
        for(int i=0;i<M;i++){
            c[0]= s.next();
            for (int j = 1; j<N+1;j++){
                c[j] = s.next();
                if(c[j].equals("O")){
                    max +=arr[j-1];
                }
            }
            int name2 = Integer.parseInt(name);
            int n2 = Integer.parseInt(c[0]);
            if(max>max2){
                max2=max;
                name = c[0];
            } else if (max==max2&&name2>n2){
                name =c[0];
            }
            max = 0;
        }
        System.out.println(name+" "+max2);
    }
}
