package DFS;

public class Dfs1 {
    public void DFS(int n) {
        if(n == 0) return;
        else {
            DFS(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Dfs1 T = new Dfs1();
        T.DFS(3);
    }
}
