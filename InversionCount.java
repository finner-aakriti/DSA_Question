package dsapract;

import java.util.Scanner;

public class InversionCount {
	public static int inversionCount(int ar[],int n)
	{
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ar[i] > (2*ar[j]))count++;
			}
		}
		return count;
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
		System.out.println(inversionCount(ar,n));

	}

}
