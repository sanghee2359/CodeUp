import java.util.Scanner;

public class CodeUp1056 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int booleanA = sc.nextInt();
        int booleanB = sc.nextInt();

        if(booleanA != booleanB) System.out.println(1);
        else System.out.println(0);
    }
}

