package inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 가위바위보 {

    public ArrayList<String> solution(int n, int[] a1, int[] a2){
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(a1[i]==1 && a2[i]==3) arr.add("A");
            else if(a1[i]==2 && a2[i]==1) arr.add("A");
            else if(a1[i]==3 && a2[i]==2) arr.add("A");
            else if(a1[i]==a2[i]) arr.add("D");
            else arr.add("B");
        }
        return arr;
    }

    public static void main(String[] args) {
        가위바위보 T = new 가위바위보();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];

        for(int i=0; i<n; i++) {
            a1[i]=sc.nextInt();
        }
        for(int j=0; j<n; j++) {
            a2[j]=sc.nextInt();
        }

        for(String x:T.solution(n,a1,a2))
            System.out.println(x);
    }
}
