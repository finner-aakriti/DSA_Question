package trees;

import java.util.LinkedList;
import java.util.Queue;

class Node
{
	int data;
	Node left, right;
	public Node(int item)
	{
		data=item;
		left=null;
		right = null;
	}
}
public class Printlevelorder {
	Node root;
	void printLevelOrder()
	{
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node tempnode = q.poll();
			System.out.print(tempnode.data +" ");
			if(tempnode.left != null)
			{
				q.add(tempnode.left);
			}
			if(tempnode.right != null)
			{
				q.add(tempnode.right);
			}
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printlevelorder ob = new Printlevelorder();
		ob.root = new Node(1);
		ob.root.left = new Node(2);
		ob.root.right = new Node(3);
		ob.root.left.left = new Node(4);
		ob.root.left.right = new Node(5);
		ob.root.right.left = new Node(6);
		ob.root.right.right = new Node(7);
		
		ob.printLevelOrder();

	}

}
