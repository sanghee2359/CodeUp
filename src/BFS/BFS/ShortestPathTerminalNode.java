package BFS.BFS;

import java.util.LinkedList;
import java.util.Queue;

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

    public int BFS(Node4 root) {
        Queue<Node4> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len ; i++) {
                Node4 x = Q.poll();
                if(x.lt == null && x.rt == null) return L;
                if(x.lt != null) Q.offer(x.lt);
                if(x.rt != null) Q.offer(x.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        ShortestPathTerminalNode tree = new ShortestPathTerminalNode();
        tree.root = new Node4(1);
        tree.root.lt = new Node4(2);
        tree.root.rt = new Node4(3);
        tree.root.lt.lt = new Node4(4);
        tree.root.lt.rt = new Node4(5);
        tree.root.rt.lt = new Node4(6);
        tree.root.rt.rt = new Node4(7);
        tree.root.lt.lt.lt = new Node4(8);
        System.out.println(tree.BFS(tree.root));
    }

}
