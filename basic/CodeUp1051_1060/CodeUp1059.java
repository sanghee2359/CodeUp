// 비트 단위 연산자 (~)
// ~(0010) = 1101

/* 음수 표현(2의 보수)
 1_ 숫자 n을 2진수로 구성하고 0을 1로, 1을 0으로 전환.
 2_ +1
 */

import java.util.Scanner;

public class CodeUp1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%d", ~n);
    }
}
