
import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] str = sc.nextLine().split("\\.");
            int a = Integer.valueOf(str[0]);
            int b = Integer.valueOf(str[1]);
            int c = Integer.valueOf(str[2]);
            System.out.printf("%04d.%02d.%02d",a,b,c);
            break;
        }
    }
}
