package inflearn.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 응급실 {

    static class Person {
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }

    }



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr = new int[n];

            int answer = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            Queue<Person> Q = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                Q.add(new Person(i, arr[i]));
            }


            while (!Q.isEmpty()) {
                Person temp = Q.poll();
                for (Person x : Q) {
                    if (x.priority > temp.priority) {
                        Q.offer(temp);
                        temp = null;
                        break;
                    }
                }
                if (temp != null) {
                    answer++;
                    if (temp.id == m) break;
                }
            }

            System.out.println(answer);
        }

}
