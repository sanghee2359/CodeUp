package DFS;

public class Fibonacci {
    public int DFS(int n) {
        if(n == 1) return 1;
        else if(n == 2) return 1;
        else {
            return DFS(n-1) + DFS(n-2);
        }
    }
    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.printf(T.DFS(i)+" ");
        }
    }

}
