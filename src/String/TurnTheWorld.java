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
        for (String x : words) {
            // StringBuilder 도 String 객체에 포함된다. 상속관계?
            // string : string끼리 더하거나 수정하면? 새로운 string객체가 생성된다.(string 불변의 특징)
            // stringBuilder : 수정, 삭제, 크기 변경할 때 하나의 객체만을 가지고 이루어진다. (stringbuilder은 가변적이다)
            String tmp = new StringBuilder(x).reverse().toString(); // reverse() 메소드
            answer.add(tmp);
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
