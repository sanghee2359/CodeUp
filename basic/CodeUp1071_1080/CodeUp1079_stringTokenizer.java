import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class CodeUp1079_tokenizer {
    public static StringTokenizer st;
    public static void main(String[] args) {
        try (InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(in);){
            st = new StringTokenizer(br.readLine()," ");
            while(st.hasMoreTokens()){
                String compare = st.nextToken();
                System.out.println(compare);
                if(compare.equals("q")) {
                    return;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}