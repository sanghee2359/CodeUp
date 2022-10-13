import java.util.Scanner;

public class CodeUp1068 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >=90 && num <= 100) System.out.println("A");     // 100 빼먹지 않게 주의
        else if(num >= 70 && num < 90) System.out.println("B");
        else if(num >= 40 && num < 70) System.out.println("C");
        else System.out.println("D");
    }
}
