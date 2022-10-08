package inflearn.bfsdfs;

import java.util.Scanner;

public class 이진수재귀출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DFS(11);


    }

    static void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2+" ");
        }

    }
}
