import java.io.*;   // BufferedReader, BufferedWriter, InputStreamReader, OutputStreamWriter
import java.util.StringTokenizer;

public class CodeUp1072 {
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void answer(int cnt) throws IOException {
        bw.write(st.nextToken());   // 다음 토큰 읽기
        bw.newLine();               // 줄바꿈
        if(cnt > 1){
            answer(cnt-1);      // 재귀 함수
        }
    }

    public static void main(String[] args)  {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " "); // 띄어쓰기로 토큰 구분
            answer(n);
            br.close();
            bw.flush();
            bw.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
