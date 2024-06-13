import java.util.Scanner;
// 깔끔하게 풀어보시길
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int [][]arr = new int[3][3];
        int x; //가로
        int y; //세로
        int i; // 카운트
        int c=0;


        for (i=0 ; i<3 ; i++)   // 임의 값 대입으로 초기화
        {
            for (int j =0; j<3; j++)
            {
                arr[i][j] = (j+2)+(i+2)*3;
            }
        }

        int a = s.nextInt(); // 1 선 2 후
        while (i < 8) {
            for (i = 0; i < 9; i++) {
                x = s.nextInt();
                y = s.nextInt();
                arr[x-1][y-1] = a; // 값 넣기
                if (c==0 && arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2]) {//가로 동일 1번줄
                    System.out.println(a);
                    c++;
                } else if (c==0 && arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2]) { //가로 2번 줄
                    System.out.println(a);
                    c++;
                } else if (c==0 && arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2]) { //가로 3번 줄
                    System.out.println(a);
                    c++;
                } else if (c==0 && arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0]) { //세로 1번줄
                    System.out.println(a);
                    c++;
                } else if (c==0 && arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1]) { //세로 2번째 줄
                    System.out.println(a);
                    c++;
                } else if (c==0 && arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2]) { //세로 3번째
                    System.out.println(a);
                    c++;
                } else if (c==0 && arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) { //대각선 왼쪽 아래
                    System.out.println(a);
                    c++;
                } else if (c==0 && arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) { //대각선 오른쪽 아래
                    System.out.println(a);
                    c++;
                } else {
                    if(c==0 && i==8) // 8이상이고 승부 안나면 무승부 출력
                    {
                        System.out.println("0");
                    }
                    if (a == 1) //아무일도 안 일어 났을 경우  공수 전환
                    {
                        a = 2;
                    } else {
                        a = 1;
                    }
                }
            }
        }
    }
}
