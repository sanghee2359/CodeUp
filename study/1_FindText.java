// 리팩토링 : 중복 되는 코드 수정
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindText {
    public int findText(char c, String str)  {
        // 문자 c와 비교해서 겹치는 수를 담는 변수
        int count = 0;

        // 문자열과 비교할 문자를 대문자로 미리 변환
        c = Character.toUpperCase(c);
        str = str.toUpperCase();

        // 비교
        for(char x : str.toCharArray()) {
            // 소문자 x와 소문자 c가 일치하면 개수 추가
            if(x == c) count++;
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        // 객체 생성
        FindText T = new FindText();

        // 입력값 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        char c = br.readLine().charAt(0);

        System.out.println(T.findText(c, st));
    }
}
