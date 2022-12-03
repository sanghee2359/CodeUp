package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

public class TurnTheWorld {
    public ArrayList<String> solution(String[] words) {
        // 리스트를 출력하니, 뒤집은 값을 이 list에 저장한다.
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]); // words[i]를 stringBuilder의 객체로 생성
            answer.add(sb.reverse().toString());
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        TurnTheWorld T = new TurnTheWorld();
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine(); // 입력
        }

        for(String word : T.solution(words)){
            System.out.println(word); // 출력
        }
    }
}
