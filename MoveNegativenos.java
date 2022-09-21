package Arrays;

import java.util.Scanner;

public class MoveNegativenos {
	public static void swap(int ar[],int i,int j)
	{
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
	}
	public static int[] move(int ar[], int n)
	{
		int i=0;
		int j=n-1;
		while(i<j)
		{
			if(ar[i]<0)
			{
				i++;
			}
			else
			{
				swap(ar,i,j);
				j--;
			}
			
		

			
		}
		return ar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int ar[]= new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println("");
		move(ar,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}

}
