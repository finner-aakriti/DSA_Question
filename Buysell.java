package dsapract;

import java.util.Scanner;

public class Buysell {
	static int maxProfit(int arr[],int n)
	{
		int max=arr[n-1];
		int sellar[]= new int[n];
		sellar[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>max)max=arr[i];
			sellar[i]=max;
		}
		int profit=0;
		for(int i=0;i<n;i++)
		{
			int p=sellar[i]-arr[i];
			if(p>profit)profit=p;
		}
		return profit;
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
		int maxprofit= maxProfit(ar,n);
		System.out.println("Max profit is "+maxprofit);
	}

}
