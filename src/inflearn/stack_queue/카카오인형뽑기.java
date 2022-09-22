package inflearn.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class 카카오인형뽑기 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer=0;

        int n = sc.nextInt();

        int[][] board = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[j][i] = sc.nextInt();
            }
        }

        Stack<Integer> stack = new Stack<>();


        int moveSize = sc.nextInt();

        int[] moves = new int[moveSize];
        for(int i=0; i<moveSize; i++) {
            moves[i]=sc.nextInt();
        }


        for(int i=0; i<moves.length; i++) {
            int temp = input(board, moves[i]);
            if(temp != 0) {
                if(stack.size() >=1 && temp==stack.peek()) {
                    stack.pop();
                    answer+=2;
                }else {
                    stack.push(temp);
                }
            }
        }
        System.out.println(answer);
    }

    static int input(int[][] board, int move) {
        for(int i=0; i<board.length; i++) {
            if(board[move-1][i]!=0) {
                int temp = board[move-1][i];
                board[move-1][i]=0;
                return temp;
            }
        }
        return 0;
    }
}
