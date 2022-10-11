
import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String[] str = sc.nextLine().split("\\:");
        int hour = Integer.valueOf(str[0]);
        int minute = Integer.valueOf(str[1]);
        int seconds = Integer.valueOf(str[2]);
        System.out.printf("%d", minute);


    }
}

