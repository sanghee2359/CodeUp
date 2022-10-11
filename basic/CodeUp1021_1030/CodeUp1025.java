import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String [] str = new String[5];

        for(int i=0; i<str.length; i++){
            str[i] = num.substring(i,i+1);
        }
        str[0] += "0000";
        str[1] += "000";
        str[2] += "00";
        str[3] += "0";

        for(int i=0; i<str.length; i++) {
            System.out.println("["+str[i]+"]");
        }
    }
}
