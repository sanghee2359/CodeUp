// 비트 연산자 : << ( 2의 n배 곱하기 ), >> ( 2의 n 나누기 )
import java.util.Scanner;

public class CodeUp1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("%d", num<<1);
    }
}
