
import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] str = sc.nextLine().split("\\-");
            int a = Integer.valueOf(str[0]);
            int b = Integer.valueOf(str[1]);

            System.out.printf("%06d%06d",a,b);
            break;
        }
    }
}
