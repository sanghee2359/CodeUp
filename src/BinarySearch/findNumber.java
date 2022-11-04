package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/* 설계
1. 순차 검색으로 숫자를 찾는다면, 1000개의 자료 중 999번째에 있다고하면 O(N)을 돌아야한다(최악의 경우)
2. 이분 검색은 맨 왼쪽과 맨 오른쪽에서 시작하여 탐색하는 것이다
3. lt = 0, rt = n-1 / mid = (lt + rt) /2
   lt = 0, rt = 7, mid = 3
4. arr[mid] == M이면 찾은 것이고, answer = mid+1 (M값의 위치)
if(arr[mid] > M) 이면, M값은 mid보다 작은 쪽에 있다 -> 큰쪽은 볼 필요없다.
5. rt의 인덱스를 mid-1로 바꿔준다. -> 큰쪽은 값이 존재할 확률이 없으니까.
6.else if(M < arr[mid]) 이면, M값은 mid보다 큰 쪽에 있다 -> 작은쪽은 볼 필요없다.
7. lt = mid+1로 전환해준다.
8. mid도 다시 구한다. mid = (바뀐lt + 바뀐 rt)/2
9. 그러다가 lt > rt 가 되면, 멈춘다.
 */
public class findNumber {
    public int solution(int n, int m, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = n-1;

        while(lt <= rt) {
            int mid = (lt + rt) /2;
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if (arr[mid] > m) {
                rt = mid - 1;
                System.out.println("현재 lt :" + lt + "현재 rt : " + rt);
            } else {
                lt = mid + 1;
                System.out.println("현재 lt :" + lt + "현재 rt : " + rt);
            }
        }
        System.out.println(Arrays.toString(arr));
    //[12, 23, 32, 57, 65, 81, 87, 99]
        return answer;
    }
    public static void main(String[] args) {
        findNumber T = new findNumber();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(N, M, arr));
    }
}
