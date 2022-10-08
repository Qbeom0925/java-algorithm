package inflearn.bfsdfs;

import java.util.Scanner;

public class 재귀함수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DFS(3);


    }

    static void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.print(n+" ");
        }

    }
}

