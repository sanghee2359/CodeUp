  package DFS;

public class Fibonacci2 {
    static int[] fibonacci;
    public int DFS(int n) {
        if(n == 1) return fibonacci[n] = 1;
        else if(n == 2) return fibonacci[n] = 1;
        else {
            return fibonacci[n] = DFS(n-2) + DFS(n-1); // 전위순회
        }
    }
    public static void main(String[] args) {
        Fibonacci2 T = new Fibonacci2();
        int n = 45;
        fibonacci = new int[n+1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci[i]+" ");
        }
    }
}
