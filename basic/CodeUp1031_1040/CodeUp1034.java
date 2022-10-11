
// String을 int 8진수로 입력받기
import java.util.Scanner;

public class CodeUp1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ocNum = Integer.valueOf(str, 8);
        System.out.printf("%d",ocNum);
    }
}
