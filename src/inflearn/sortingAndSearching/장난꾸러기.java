package inflearn.sortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기 {


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            ArrayList<Integer> answer = new ArrayList<>();

            int n = sc.nextInt();

            int[] arr = new int[n];
            int[] sortArr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i]=sc.nextInt();
                sortArr[i]=arr[i];
            }

            Arrays.sort(sortArr);

            for(int i=0; i<n; i++) {
                if(arr[i]!=sortArr[i]) answer.add(i+1);
            }

            for(int i=0; i<answer.size(); i++) {
                System.out.print(answer.get(i)+" ");
            }
        }
    }

