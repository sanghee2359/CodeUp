import java.io.*;
import java.util.StringTokenizer;

public class CodeUP1090 {
    static StringTokenizer st;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            long calc = (long)a;
            for(int i = 1; i < n; i++){
                calc *= r;
            }
            System.out.println(calc);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
