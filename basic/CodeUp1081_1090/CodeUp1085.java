import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1085 {
    public static StringTokenizer st;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());   // 헤르쯔
            int b = Integer.parseInt(st.nextToken());   // 비트
            int c = Integer.parseInt(st.nextToken());   // 채널
            int s = Integer.parseInt(st.nextToken());   // 녹음할 시간
            // 21억이 넘기 때문에 int로는 안됨. 근데 long은 왜 오버플로우?
            // 변수 뿐만 아니라 리터럴도 long 형변환 해주어야 값이 잘 들어가는 것을 확인함
            long volume = (long)h*b*c*s;
            double nMByte = (((float)volume / 8) / 1024) / 1024;
            System.out.printf("%.1f MB",nMByte);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}