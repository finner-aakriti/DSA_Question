package dsapract;

import java.util.Scanner;

public class KadaneAlgo {
	static int maxSum(int arr[], int n)//to calculate max sum sub-array in given 1-D Array
	{
		int maxsum= Integer.MIN_VALUE;
		int max=0;
		for(int i =0;i<n;i++)
		{
			max=max+ arr[i];
			if(maxsum<max)maxsum=max;
			if(max<0)max=0;
		}
		return maxsum;
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
		int maxsum= maxSum(ar,n);
		System.out.println("Max possible sum is "+maxsum);

	}

}
