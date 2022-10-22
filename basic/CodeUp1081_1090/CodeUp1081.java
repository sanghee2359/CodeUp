import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1081 {
    public static StringTokenizer st;
    public static void main(String[] args) {
        try(InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);){
            st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            for(int i = 1; i <= num1; i++){
                for(int j = 1; j <= num2; j++){
                    System.out.printf("%d %d\n", i, j);
                }
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}