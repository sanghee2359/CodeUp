package String;

import java.util.Scanner;

public class FindText {
    public int findNum(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for(char x : str.toCharArray()){
            if(x == c) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        FindText T = new FindText();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);

        System.out.println(T.findNum(str,c));
    }
}
