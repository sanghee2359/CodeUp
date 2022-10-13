// ( | )연산자 : 비트 1이 하나라도 있으면 1

import java.util.Scanner;

public class CodeUp1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a|b);
    }
}
