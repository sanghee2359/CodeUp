import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1086 {
    public static StringTokenizer st;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());   // 가로 해상도
            int h = Integer.parseInt(st.nextToken());   // 세로 해상도
            int b = Integer.parseInt(st.nextToken());   // 1px을 저장하기 위한 bit
            long volume = (long)w*h*b;
            double nMByte = (((float)volume / 8) / 1024) / 1024;
            System.out.printf("%.2f MB",nMByte);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
