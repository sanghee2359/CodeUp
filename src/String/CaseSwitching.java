package String;

import java.util.Scanner;

public class CaseSwitching {
    public String switching(String str){
        String answer = "";
        for(char x : str.toCharArray())
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);

        return answer;
    }
    public static void main(String[] args) {
        CaseSwitching T = new CaseSwitching();
        Scanner in=new Scanner(System.in);
        String str = in.next();

        System.out.println(T.switching(str));
    }
}
