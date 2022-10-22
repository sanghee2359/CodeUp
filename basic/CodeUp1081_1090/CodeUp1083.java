import java.io.*;

public class CodeUp1083 {
    public static void main(String[] args) {
        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int num = Integer.parseInt(br.readLine());
            String line = "";
            for(int i = 1; i <= num; i++){
                if(i % 3 != 0) line+=i;
                else line +="X";

                if(num == i){
                    System.out.println(line);
                }else{
                    line += " ";
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
