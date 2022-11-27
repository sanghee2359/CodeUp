// 리팩토링 : 함수 생성
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindText {
    public int findText(char c, String str)  {
        // 문자 c와 비교해서 겹치는 수를 담는 변수
        int count = 0;

        // 입력받은 문자 c가 소문자일 경우
        if(Character.isLowerCase(c)) {
            // 문자열을 소문자로 변환 후 char[] 으로 만든다.
            // for문으로 뿌리기
            for(char x : str.toLowerCase().toCharArray()) {
                // 소문자 x와 소문자 c가 일치하면 개수 추가
                if(x == c) count++;
            }
        } else { // 대문자일 경우
            for(char x : str.toUpperCase().toCharArray())
                // 대문자 x와 대문자 c가 일치하면 개수 추가
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

        // 함수 호출
        System.out.println(T.findText(c, st));
    }
}