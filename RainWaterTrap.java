package dsapract;

import java.util.Scanner;
import java.util.Stack;

public class RainWaterTrap {
	public static int rainwater(int arr[],int n)
	{
		int res[]= new int[n];
		int left[]= new int[n];
		int right[]= new int[n];
		Stack<Integer> st= new Stack<>();
		st.push(arr[0]);
		left[0]=arr[0];
		for(int i=1;i<n;i++)
		{
			if(st.peek()<arr[i])st.push(arr[i]);
			left[i]=st.peek();
		}
		Stack<Integer> st1= new Stack<>();
		st1.push(arr[n-1]);
		right[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(st1.peek()<arr[i])st1.push(arr[i]);
			right[i]=st1.peek();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			res[i]=(Math.min(left[i], right[i])) - arr[i];
			sum +=res[i];
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n= sc.nextInt();
		System.out.println("Enter elements");
		int ar[]= new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int res;
		res=rainwater(ar,n);
		System.out.print(res);
		

	}

}
