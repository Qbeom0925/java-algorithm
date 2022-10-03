package inflearn.sortingAndSearching;
import java.util.*;

public class 이분검색 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int answer = 0;

        int n = sc.nextInt();
        int m =sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int lt=0;
        int rt = n-1;

        while(lt<=rt) {
            int mid = (lt+rt)/2;
            if(arr[mid]==m) { // 답을 찾았을 때
                answer=mid+1;
                break;
            }
            if(arr[mid]>m) {
                rt=mid-1;
            }else {
                lt=mid+1;
            }

        }


        System.out.println(answer);


    }
}
