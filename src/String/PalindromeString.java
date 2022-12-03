package String;

import java.util.Scanner;

public class PalindromeString {
    public String isiPalindrome(String str) {
        String answer="YES";
        str = str.toUpperCase(); // 대문자로 모두 변경
        int len = str.length();
        for (int i = 0; i < len/2; i++) { // 홀수건 짝수건 str의 절반길이만큼만 반복실행한다.
            if(str.charAt(i) != str.charAt(len-i-1)) answer = "NO";
        }
        return answer;
    }
    public static void main(String[] args) {
        PalindromeString T = new PalindromeString();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.isiPalindrome(str));
    }
}
