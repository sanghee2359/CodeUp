// 변수 3개를 3항연산자로 최소값 구하기
import java.util.Scanner;

public class CodeUp1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = (a > b ? b : c) > c ? c : (a > b ? b : a);
        System.out.println(result);
    }
}
