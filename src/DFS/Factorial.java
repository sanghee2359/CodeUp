package DFS;

public class Factorial {
    public int DFS(int n) {
        if(n == 1) {
            System.out.println(n);
            return 1;
        }
        else {
            System.out.print(n+"*");
            return n * DFS(n-1);
        }
    }
    public static void main(String[] args) {
        Factorial T = new Factorial();
        System.out.println(T.DFS(5));
    }

}
