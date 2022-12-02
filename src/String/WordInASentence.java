package String;
//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성
import java.util.Arrays;
import java.util.Scanner;

public class WordInASentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" "); // 빈 칸을 기준으로 split

        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < str.length; i++) { // 길이 max값 찾기
            if(max < str[i].length()){
                max = str[i].length();
                idx = i;
            }
        }
        System.out.println(str[idx]);
    }
}
