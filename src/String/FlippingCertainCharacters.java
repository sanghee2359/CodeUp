package String;
//영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
//특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//input : a#b!GE*T@S
//output : S#T!EG*b@a

public class FlippingCertainCharacters {
    public String reverseIfNotSpecialSymbol(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0, rt = s.length-1;

        while(lt < rt){
            if(!(Character.isAlphabetic(s[lt]))){
                lt ++;
            }else if(!(Character.isAlphabetic(s[rt]))){
                rt --;
            }else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(s);

        return answer;
    }
    public static void main(String[] args) throws IOException {
        FlippingCertainCharacters T = new FlippingCertainCharacters();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.reverseIfNotSpecialSymbol(str));
    }
}
