package BFS.BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {
    Node2 lt;
    Node2 rt;
    int data;

    public Node2(int data) {
        this.data = data;
        lt = rt = null;
    }
}
public class Bfs1 {
    Node2 root;
    public void BFS(Node2 root){
        Queue<Node2> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0; // root노드의 레벨
        while(!Q.isEmpty()){
            int len = Q.size(); // 노드 개수 파악
            System.out.print(L+" : ");
            for (int i = 0; i < len; i++) {
                Node2 current = Q.poll(); //노드 하나 꺼내기
                System.out.print(current.data+ " ");
                if(current.lt != null) Q.offer(current.lt);
                if(current.rt != null) Q.offer(current.rt);
            }
            L++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Bfs1 tree = new Bfs1();
        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        tree.root.rt.lt = new Node2(6);
        tree.root.rt.rt = new Node2(7);
        tree.BFS(tree.root);
    }
}
