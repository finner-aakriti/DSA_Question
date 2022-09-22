package Arrays;

import java.util.Scanner;

public class CyclicallyRotate {
	public static void rotate(int ar[],int n)
	{
		int temp=ar[n-1];
		int i=n-2;
		while(i>=0)
		{
			ar[i+1]=ar[i];
			i--;
		}
		ar[0]=temp;
		
	}

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int ar[]= new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("");
		rotate(ar,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}


	}

}
