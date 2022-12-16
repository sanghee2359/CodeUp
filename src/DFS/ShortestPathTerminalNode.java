package DFS;
class Node4 {
    Node4 lt;
    Node4 rt;
    int data;

    public Node4(int data) {
        this.data = data;
        lt = rt = null;
    }
}
public class ShortestPathTerminalNode {
    Node4 root;
    public int DFS(int L, Node4 root){
        // 말단노드까지의 최단 거리 구하기
        if(root.lt == null && root.rt == null) {
            return L;
        }

        else {
            return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt)); //
        }
    }
    public static void main(String[] args) {
        ShortestPathTerminalNode tree = new ShortestPathTerminalNode();
        tree.root = new Node4(1);
        tree.root.lt = new Node4(2);
        tree.root.rt = new Node4(3);
        tree.root.lt.lt = new Node4(4);
        tree.root.lt.rt = new Node4(5);
        System.out.println(tree.DFS(0, tree.root));
    }

}
