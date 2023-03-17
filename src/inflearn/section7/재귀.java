package inflearn.section7;

import java.util.*;
import java.io.*;

public class 재귀 {

	static int N;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		dfs(N);
	}
	
	public static void dfs(int s) {
		if(s == 0) {
			return;
		}
		dfs(s - 1);
		System.out.print(s + " ");
	}

}
