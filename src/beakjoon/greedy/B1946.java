package beakjoon.greedy;
import java.util.*;
import java.io.*;

public class B1946 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][2];
            int cnt = 1;
            for(int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int documentScore = Integer.parseInt(st.nextToken());
                int interviewScore = Integer.parseInt(st.nextToken());
                arr[j][0] = documentScore;
                arr[j][1] = interviewScore;
            }

            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] arr1, int[] arr2) {
                    return Integer.compare(arr1[0], arr2[0]);
                }
            });

            //정렬후 첫번째 서류 합격자는 합
            int first = arr[0][1];


            for(int j = 1; j < N; j++) {
                if(arr[j][1] < first) {	// 면접 성적이 그 전 선발된 지원자 보다 뛰어날경우 => 선발
                    first = arr[j][1];	// 다음 합격자를 판별하기 위해 전에 선발된 지원자의 면접 성적 저장
                    cnt ++;
                }
            }
            System.out.println(cnt);

        }

    }

}
