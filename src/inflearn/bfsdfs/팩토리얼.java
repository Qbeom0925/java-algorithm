package inflearn.bfsdfs;

public class 팩토리얼 {
    public static void main(String[] args) {
        System.out.print(DFS(5));



    }

    static int DFS(int n) {
        if(n==1) return 1;
        else {
            return n*DFS(n-1);
        }

    }
}
