package inflearn.section7;

import java.util.*;

public class 말단노드 {

	static Node root;
	
	public static void main(String[] args) {
		root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);		
		
		System.out.println(BFS(root));
	}
	
	public static int DFS(int L, Node root) {
		if(root.lt == null && root.rt == null) return L;
		else {
			return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
		}
	}
	
	static int BFS(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int L=0;
		
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i = 0; i < len; i++) {
				Node cur = q.poll();
				if(cur.lt == null && cur.rt == null) return L;
				if(cur.lt != null) q.offer(cur.lt);
				if(cur.rt != null) q.offer(cur.rt);
			}
			L++;
		}
		
		return L;
	}

}
