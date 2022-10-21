import java.util.Scanner;

public class CodeUp1080 {
    public static boolean isBig(int sum, int n){
        if(sum < n){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i;

        for(i=0; i<n; i++){
            sum += i;
            if(isBig(sum, n)){
                System.out.println(i);
                return;
            }
        }
    }
}
