import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1084 {
    public static StringTokenizer st;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());
            int count = 0;
            for(int i = 0; i < num1; i++){
                for(int j = 0; j < num2; j++){
                    String str = ""; // 문자열 초기화
                    for(int k = 0; k < num3; k++){
                        str += i+" "+j+" "+k+"\n";
                    }
                    bw.write(str);
                    bw.flush();
                }
            }
            System.out.println(num1 * num2 * num3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
