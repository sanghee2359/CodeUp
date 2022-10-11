
import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String[] str = sc.nextLine().split("\\.");
        int year = Integer.valueOf(str[0]);
        int mont = Integer.valueOf(str[1]);
        int day = Integer.valueOf(str[2]);
        System.out.printf("%02d-%02d-%04d", day, mont, year);


    }
}
