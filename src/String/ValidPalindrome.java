package String;
// 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

import java.util.Scanner;

// input : found7, time: study; Yduts; emit, 7Dnuof
// output : YES
public class ValidPalindrome {

    public String solution(String str){
        String answer="NO";

        // str의 알파벳을 제외한 나머지를 어떻게 자를까?
        str = str.toUpperCase().replaceAll("[^A-Z]","");// 알파벳 A부터 Z가 아니면

        // Stringbuilder로 뒤집은 수
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer="YES";
        return answer;
    }
    public static void main(String[] args) {
        ValidPalindrome T = new ValidPalindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
