
import java.util.Scanner;

public class CodeUp1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int charToInt = (int)sc.next().charAt(0);
        System.out.printf("%c", (char)charToInt+1);
    }
}
