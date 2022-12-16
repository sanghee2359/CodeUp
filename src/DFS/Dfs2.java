package DFS;
class Node{
    Node lt,rt;
    int data;
    public Node(int data) {
        this.data = data;
        rt = lt = null;
    }
}

public class Dfs2 {
    Node root;
    public void DFS(Node root) {
        if(root == null) return; // root가 가장 말단노드 -> 종료
        else {
            DFS(root.lt);
            DFS(root.rt);
            System.out.printf(root.data+" ");
        }
    }
    public static void main(String[] args) {
        Dfs2 tree = new Dfs2();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root); // dfs()에서 깊이우선탐색 코드 구현


    }
}