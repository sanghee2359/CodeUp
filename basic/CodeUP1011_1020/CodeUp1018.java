
import java.util.Scanner;

public class CodeUp1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] str = sc.nextLine().split("\\s");
            for(String s : str){
                System.out.printf(s+" ");
            }
            break;
        }
    }
}
