import java.util.Scanner;

public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((int)a/b);
        System.out.println(a%b);
        System.out.printf("%.2f\n", (double)a/b);

    }
}