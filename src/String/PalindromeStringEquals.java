package String;

import java.util.Scanner;

public class PalindromeStringEquals {
    public String isiPalindrome(String str) {
        String answer="NO";
        String reverse = new StringBuilder(str).reverse().toString();
//        String reverse = sb.reverse().toString();
        if(str.equalsIgnoreCase(reverse)) answer = "YES"; // equalsIgnoreCase : 대소문자 구분 없이 비교
        return answer;
    }
    public static void main(String[] args) {
        PalindromeStringEquals T = new PalindromeStringEquals();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.isiPalindrome(str));
    }
}
