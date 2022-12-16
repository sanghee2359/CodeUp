package BFS.BFS;
// 휴대폰을 잃어버렸다. 휴대폰엔 위치추적기가 달려있다.
// 나의 위치와 핸드폰의 위치가 수직선상의 좌표 점으로 주어지는데, 현재 위치에서 휴대폰의 위치까지 다음과 같은 방법으로 이동한다.
// 나는 한 번의 점프로 앞으로 1, 뒤로 1,앞으로 5를 이동할 수 있다.
// 최소 몇 번의 점프로 휴대폰을 찾을 수 있는지 구하는 프로그램을 작성하라

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindShortestDistance {
    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch; // 중복된 것은 q에 저장하지 x
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e) {
        ch = new int[10001]; // 1~10000 범위
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size(); // 노드 개수 파악

            for (int i = 0; i < len; i++){
                int x = Q.poll();

                for (int j = 0; j < dis.length; j++) {
                    int nx = x+dis[j];
                    if(nx == e) return L+1; // nx는 n의 자식노드이므로 +1
                    if(nx >= 1 && nx <= 10000 && ch[nx]==0) { // 노드 범위 + 중복 조건 처리
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        FindShortestDistance T = new FindShortestDistance();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // 내 위치
        int e = sc.nextInt(); // 휴대폰 위치
        System.out.println(T.BFS(s, e));
    }
}
