package programmers;

import java.util.*;

class Solution {


    public static int solution(int[] s) {
        int[] result = new int[s.length];
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1];
            if ((i+1) % 2 == 0) {
                if (s[i-1] > s[i]) {
                    result[i] += 1;
                }
                continue;
            }
            if (s[i-1] < s[i]) {
                result[i] += 1;
            }
        }
        return Arrays.stream(result).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3}));
    }
}
