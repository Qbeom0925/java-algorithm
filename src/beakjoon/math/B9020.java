package beakjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        boolean [] era = new boolean[10001];
        for(int i=2;i<Math.sqrt(10001);i++) {
            if(!(era[i])) {
                for(int j=2;i*j<10001;j++) {
                    era[i*j]=true;
                }
            }
        }

        int n=Integer.parseInt(br.readLine());
        int cnt;

        for(int i=0;i<n;i++) {
            int temp =Integer.parseInt(br.readLine());
            temp/=2;
            cnt=0;
            while(true) {
                if(!(era[temp-cnt])&& !(era[temp+cnt])) {
                    System.out.println((temp-cnt)+" "+(temp+cnt));
                    break;
                }
                String answer = "";
                answer.
                cnt++;
            }
        }

    }
}
