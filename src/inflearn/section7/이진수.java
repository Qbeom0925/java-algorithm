package inflearn.section7;

public class 이진수 {

	public static void main(String[] args){
		
		System.out.println(DFS(5));
	}
	
	public static int DFS(int n) {
		if(n == 0) return 1;
		else {
			return n * DFS(n-1);
		}
	}

}
