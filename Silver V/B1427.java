import java.util.Arrays;
import java.util.Scanner;

public class B1427 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char[] arr = s.nextLine().toCharArray(); // 입력후 길이만큼 배열로 전환

        Arrays.sort(arr); // 배열 오름차순 정렬

        for (int i = arr.length-1; i>=0; i--) // 배열 내림차순으로
        {
            System.out.print(arr[i]);
        }
    }
}
