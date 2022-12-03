package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
//N개의 단어가 주어지면 각 단어를 특정 기준뒤집어 출력하는 프로그램을 작성하세요.

public class TurnTheWorldReverseCondition {
    public ArrayList<String> solution(String[] words) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : words) {
            char[] s = x.toCharArray(); // 단어를 문자로 쪼갠다.
            int lt = 0, rt = s.length-1;
            while(lt < rt) { // 간단한 이분탐색이 들어갔다.
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(s));
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        TurnTheWorldReverseCondition T = new TurnTheWorldReverseCondition();
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
