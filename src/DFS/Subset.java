package DFS;

import java.util.Arrays;

public class Subset {
    static int n; // 집합의 원소의 개수
    static int[] ch; // 인덱스 번호를 집합의 원소로 지정
    public void DFS(int L) {
        if(L == n+1) {
            for(int i = 1; i<= n; i++){
                if(ch[i]==1) System.out.printf("%d ", i);
            }
            System.out.println();
        }
        else {
            ch[L] = 1;
            DFS(L+1); // 사용한다 1
            ch[L] = 0;
            DFS(L+1); // 사용하지 않는다 0
        }
    }
    public static void main(String[] args) {
        Subset T = new Subset();
        n = 3;
        ch = new int[n+1];
        T.DFS(1);
//        for (int i = 1; i <= n; i++) {
//            if(ch[i]==1) System.out.print(i);
//            System.out.println();
//        }
    }
}
