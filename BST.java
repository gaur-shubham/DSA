import java.util.*;

public class BST{

	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
		this.data = data;
		}
	}
	
	public static Node insert(Node root, int val){
		if(root == null){
			root = new Node(val);
			return root;
		}
		
		if(root.data > val){
			root.left = insert(root.left, val);
		}
		else{
			root.right = insert(root.right, val);
		}
		
		return root;
		
	}
	
	public static void inOrder(Node root){
		if(root == null){
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static boolean search(Node root, int key){
		if(root == null){
			return false;
		}
		
		if(root.data > key){
			return search(root.left, key);
		}if(root.data == key){
			return true;
		}else{
			return search(root.right, key);
		}
		
	}
	
	public static Node delete(Node root, int key){
		if(root.data > key){
			root.left = delete(root.left, key);
		}else if (root.data < key){
			root.right = delete(root.right, key);
		}else{
			//Case I
			if(root.left == null && root.right == null){
				return null;
			}
			
			//Case II
			if(root.left == null){
				return root.right;
			}else if(root.right == null){
				return root.left;
			}
			
			//Case III
			Node IS = inOrderSuccessor(root.right);
			root.data = IS.data;
			root.right = delete(root.right, IS.data);
			
		}
		
		return root;
		
	}
	
	public static Node inOrderSuccessor(Node root){
		while(root.left != null){
			root = root.left;
		}
		return root;
	}
	public static Node printInRange(Node root, int x, int y){
		if(root == null){
			return null;
		}
		
		if(root.data >= x && root.data <= y){
			printInRange(root.left,x,y);
			System.out.print(root.data+" ");
			printInRange(root.right,x,y);
			
		}else if(root.data > y){
			printInRange(root.left, x,y);
		}else{
			printInRange(root.right, x,y);
		}
		
		return root;
	}
	public static void printPath(ArrayList<Integer> path){
		
		for(int n : path){
			System.out.print(n+" ->");
		}
		System.out.println();
	}
	public static void printRoot2leaf(Node root, ArrayList<Integer> path){
		if(root == null){
			return;
		}
		
		path.add(root.data);
		if(root.left == null && root.right == null){
			printPath(path);
		}else{
		printRoot2leaf(root.left, path);
		printRoot2leaf(root.right, path);
		}
		path.remove(path.size()-1);
		
	}
	public static void main(String[] args){
		int[] list = {8,5,3,6,10,11,14};
		Node root = null;
		
		for(int n : list){
			root = insert(root, n);
		}
		
		inOrder(root);
		System.out.println();
		
		/* if(search(root, 7)){
			System.out.println("Exists");
		}else{
			System.out.println("Not Exists");
		}
		
		
		deletee(root, 1);
		inOrder(root);
		
		*/
		
		//printInRange(root,6,10);
		
		printRoot2leaf(root, new ArrayList<>());
		
	}
}