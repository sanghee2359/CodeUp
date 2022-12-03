package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

public class TurnTheWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine(); // 입력 값
            StringBuilder sb = new StringBuilder(words[i]); // stringBuilder 객체 생성
            words[i] = sb.reverse().toString(); // StringBuilder의 reverse() 사용
        }
        for(String word : words){
            System.out.println(word);
        }
    }
}
