package String;

import java.util.Scanner;
// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.

public class WorldInASentence_IndexOf {
    public String solution(String str) {
        int max = Integer.MIN_VALUE;
        int pos = 0;
        String answer = "";
        while ((pos = str.indexOf(" ")) != -1) { // " "을 찾지 못하면 -1 출력
            // max 값과 비교.
            // pos (현재 단어 길이)가 더 긴 경우 answer를 교체한다.
            if( pos > max ) {
                max = pos;
                // answer 단어 변경
                answer = str.substring(0, pos);
            }
            // pos의 index부분을 자른 나머지를 다시 str에 저장 -> 매 반복마다 있어야하는 조건
            str = str.substring(pos+1); // " " 빈칸 다음부터 저장
        }

        if(str.length() > max) answer = str;
        return answer;
    }
    public static void main(String[] args) {
        WorldInASentence_IndexOf T = new WorldInASentence_IndexOf();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 빈 칸을 기준으로 split

        System.out.println(T.solution(str));
    }
}
