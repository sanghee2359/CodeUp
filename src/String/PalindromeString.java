package String;

import java.util.Scanner;

public class PalindromeString {
    public String isiPalindrome(String str) {
        String answer="";
        str = str.toUpperCase(); // 대문자로 모두 변경
        int lt = 0, rt = str.length()-1; // 이분 탐색으로 풀이
        int count=0;
        while(lt < rt){
            if(str.charAt(lt) == str.charAt(rt)){
                System.out.printf("lt:%c",str.charAt(lt));
                System.out.printf(" rt:%c\n",str.charAt(rt));
                count++;
            }
            lt++;
            rt--;
        }
        System.out.println(count);
        if(count == str.length()/2) answer = "YES";
        else answer="NO";

        return answer;
    }
    public static void main(String[] args) {
        PalindromeString T = new PalindromeString();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.isiPalindrome(str));
    }
}
