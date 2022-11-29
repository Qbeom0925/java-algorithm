package beakjoon.implementation;

public class B4673 {
    public static void main(String[] args) {
        boolean[] isSelf = new boolean[10001];
        for(int i=1; i<10000; i++) {
            int selfNum = selfNumber(i);
            if(selfNum<10001) {
                isSelf[selfNum]=true;
            }
        }
        for(int i=1; i<isSelf.length; i++) {
            if(!isSelf[i]) System.out.println(i);
        }
    }

    public static int selfNumber(int n) {
        int num = n;
        while(n>0) {
            num=num+n%10;
            n=n/10;
        }
        return num;
    }
}
