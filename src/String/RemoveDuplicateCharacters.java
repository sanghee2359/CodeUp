package String;

import java.util.Scanner;

//소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
//중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

// input : ksekkset
public class RemoveDuplicateCharacters {
    public String solution(String str){
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char target = str.charAt(i); // i번째 문자
            int idx = str.indexOf(target); // 그 문자의 index를 구한다
            if(i == idx) { // i와 index가 다르다면 이미 i보다 앞에 문자가 존재한다는 의미이므로(=중복) 추가하지 않는다.
                sb.append(target);
            }
        }
        answer = sb.toString();
        return answer;
    }
    public static void main(String[] args) {
        RemoveDuplicateCharacters T = new RemoveDuplicateCharacters();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
