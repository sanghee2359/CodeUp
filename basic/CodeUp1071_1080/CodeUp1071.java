import java.util.Scanner;

// 0이 입력될 때까지 무한 출력
public class CodeUp1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr;
        while(sc.hasNextLine()){
            arr = sc.nextLine().split("\\s");       // 빈 칸이면 split
            for(String x : arr){                          // split한 값을 담은 arr을 하나씩 가져온다
                int intX = Integer.parseInt(x);           // string -> Int형 변환
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
