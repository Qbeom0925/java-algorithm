package beakjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1101 {

    public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		int cnt=0;
//		String value = String.valueOf(n);
//		if(Integer.parseInt(value)<10) {
//			value+="0";
//			n=Integer.parseInt(value);
//		}
//
//		while(true) {
//			int sum =0;
//			for(char x :value.toCharArray()) {
//				sum+=x-'0';
//			}
//			String k = String.valueOf(sum);
//			String lNum = String.valueOf(value.charAt(value.length()-1))+String.valueOf(k.charAt(k.length()-1));
//			cnt++;
//			if(Integer.parseInt(lNum)==n) {
//				System.out.println(cnt);
//				break;
//			}
//			value=lNum;
//		}

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N =Integer.parseInt(bf.readLine());
        int sum,cnt,temp,tempL,tempR;;
        temp = N;
        cnt = 0;
        do{
            float a1 = temp/10;
            System.out.println(a1);
            System.out.println(temp%10);

            tempL = temp/10;
            tempR = temp%10;

            sum = tempL+tempR;
            temp = (tempR*10) + sum%10;
            cnt++;
        }while(N != temp);

        System.out.println(cnt);
    }
}
