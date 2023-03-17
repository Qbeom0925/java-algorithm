package white;

import java.util.LinkedList;
import java.util.Objects;

public class Test {

    public static class  LinkedList{
        int data;
        LinkedList next;

        public LinkedList(int data) {
            this.data = data;
        }

        public LinkedList getNext() {
            return next;
        }

        public LinkedList setNext(LinkedList next) {
            this.next = next;
            return this;
        }

        private LinkedList append(LinkedList linkedList){
            return linkedList.setNext(linkedList);
        }

        private int get_at(int n){
            LinkedList returnObject = null;
            for (int i = 0; i <= n; i++){
                returnObject = getNext();
            }

            return Objects.requireNonNull(returnObject).data;
        }

        private void print(LinkedList list){
            LinkedList linkedList = list;
            while (list.getNext() != null){
                System.out.println(list.data);
                linkedList = linkedList.getNext();
            }
        }

//        private LinkedList reverse(){
//
//        }

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(0);
        LinkedList appendObject = new LinkedList(1);
        linkedList.append(appendObject);

        for (int i = 1; i < 20; i ++){
            appendObject = new LinkedList(i);
            LinkedList appendedObject = new LinkedList(i);
            appendObject.append(appendedObject);
        }

        System.out.println(linkedList.get_at(2));



    }



}


