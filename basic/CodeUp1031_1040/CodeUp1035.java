
import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int hexNum = Integer.valueOf(str, 16);

        System.out.printf("%o", hexNum);
    }
}
