
import java.io.*;
import java.util.*;

public class CodeUp1079 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)  {
        try(InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in)) {
            String line;
            String [] tokens;
            while((line = br.readLine())!= null){
                tokens = line.split("\\s");
                for(int i = 0; i< tokens.length; i++){
                    System.out.println(tokens[i]);
                    if (tokens[i].equals("q")) {
                        return;
                    }
                }
            }
            br.close();
            bw.flush();
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
