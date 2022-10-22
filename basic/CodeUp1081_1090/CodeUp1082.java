import java.io.*;

public class CodeUp1082 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(br.readLine(), 16);
            int F = Integer.parseInt("F", 16);
            for(int i = 1; i<=F; i++){
                System.out.printf("%X*%X=%X\n", num, i, num*i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
