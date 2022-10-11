
import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.next().split("");
        for(String x : str) {
            System.out.println("\'"+x+"\'");
        }
    }

}
