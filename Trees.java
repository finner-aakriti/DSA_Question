package gfgTrees;

import java.util.Scanner;

class TreeNode
{
	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data)
	{
		this.data=data;
	}
}

public class Trees {
	public static int height(TreeNode root)
	{
		if(root == null)return 0;
		int leftNodes=height(root.left);
		int rightNodes=height(root.right);
		return 1+ Math.max(leftNodes, rightNodes);
	}
	public static int diameter(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		int left = height(root.left);
		int right = height(root.right);
		int d= left + right +1;
		int leftmax = diameter(root.left);
		int rightmax = diameter(root.right);
		return Math.max(Math.max(leftmax, rightmax), d);
		
	}
	public static TreeNode takeInput(boolean isRoot, int parentData, boolean isLeft)
	{
		if(isRoot)
		{
			System.out.print("Enter root's data");
		}
		else
		{
			if(isLeft)
			{
				System.out.print("Enter left child of "+parentData+":");
			}
			else
			{
				System.out.print("Enter right child of "+parentData+":");
			}
		}
		Scanner sc = new Scanner(System.in);
		int data=sc.nextInt();
		if(data==-1)
		{
			return null;
		}
		TreeNode root = new TreeNode(data);
		TreeNode rootLeft = takeInput(false,data,true);
		TreeNode rootRight = takeInput(false,data,false);
		 root.left=rootLeft;
		 root.right=rootRight;
		 return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root =takeInput(true,-1,false);
		
		 System.out.println(diameter(root));

	}

}
