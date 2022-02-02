package dsapract;

import java.util.Arrays;
import java.util.Scanner;

public class CandyDistribution {
	static int distribute(int rank[],int n )
	{
		int left[] = new int[n];
		int right[] = new int[n];
		Arrays.fill(left, 1);
		Arrays.fill(right, 1);
		for(int i=1;i<n;i++)
		{
			if(rank[i]>rank[i-1])left[i]=left[i-1]+1;
		}
		for(int i=n-2;i>=0;i--)
		{
			if(rank[i]>rank[i+1])right[i]=right[i+1]+1;
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.print(left[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<n;i++)
		{
			System.out.print(right[i]+" ");
		}
		for(int i=0;i<n;i++)
		{
			sum += Math.max(left[i], right[i]);
		}
		System.out.println("");
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n= sc.nextInt();
		System.out.println("Enter elements");
		int rank[]= new int[n];
		for(int i=0;i<n;i++)
		{
			rank[i]=sc.nextInt();
		}
		int min_candy= distribute(rank,n);
		System.out.println("Minimum no. of candies required is "+min_candy);

	}

}
