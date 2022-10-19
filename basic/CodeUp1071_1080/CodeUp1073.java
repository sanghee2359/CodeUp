// 풀이는 1071과 동일 - 입력되는 정수를 알 수 없기 때문에
import java.util.Scanner;

public class CodeUp1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr;
        while(sc.hasNextLine()){
            arr = sc.nextLine().split("\\s");       // 빈 칸이면 split
            for(String x : arr){                          // split한 값을 담은 arr을 하나씩 가져온다
                int intX = Integer.parseInt(x);           // string -> Int형으로 변환
                if(intX == 0){
                    break;
                }else{
                    System.out.println(intX);
                }
            }
        }
        sc.close();
    }
}