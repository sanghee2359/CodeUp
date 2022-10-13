import java.util.Scanner;

// NOR
public class CodeUp1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int booleanA = sc.nextInt();
        int booleanB = sc.nextInt();

        if(booleanA==0 && booleanB==0 ) System.out.println(1);
        else System.out.println(0);
    }
}

