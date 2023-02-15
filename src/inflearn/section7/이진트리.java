package inflearn.section7;


class Node{
	int data;
	Node lt,rt;
	public Node(int val){
		data = val;
		lt=rt=null;
	}
}

public class 이진트리 {	
	static Node root;
	
	public static void main(String[] args) {
		root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);
		root.rt.lt = new Node(6);
		root.rt.rt = new Node(7);
		
		DFS(root);		
	}
	
	public static void DFS(Node root) {
		if(root == null) return;
//		if(root.lt == null && root.rt == null) return;
		else {
			if(root.lt != null) DFS(root.lt);
			if(root.rt != null) DFS(root.rt);
			System.out.print(root.data + " ");
		}
		
		
	}

}
