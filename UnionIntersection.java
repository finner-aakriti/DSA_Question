package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UnionIntersection {
	public static void union(int a[],int b[],int n,int m)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			hs.add(a[i]);
			list.add(a[i]);
		}
		for(int i=0;i<m;i++)
		{
			if(!hs.contains(b[i]))list.add(b[i]);
		}
		int i=0;
		int x=list.size();
		while(i<x)
		{
			System.out.print(list.get(i)+" ");
			i++;
		}
	}
	public static int intersection(int a[],int b[],int n,int m)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			hs.add(a[i]);	
		}
		for(int i=0;i<m;i++)
		{
			if(hs.contains(b[i]))list.add(b[i]);
		}
		return list.size();
	}

	public static void main(String[] args) {
		int n,m;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int a[]= new int[n];
		int b[]= new int[m];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("");
		union(a,b,n,m);
		System.out.println("");
		System.out.println(intersection(a,b,n,m));
		
		


	}

}
