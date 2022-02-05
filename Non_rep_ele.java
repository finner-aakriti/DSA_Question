package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Non_rep_ele {
	static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        ArrayList<Integer> lis = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {

           
            Integer c = hmap.get(arr[i]);

            if (hmap.get(arr[i]) == null) {
                hmap.put(arr[i], 1);
            }

            else {
                hmap.put(arr[i], ++c);
            }
        }
        
        System.out.println(hmap);
        for(int i=0;i<n;i++)
        {
          if(hmap.containsKey(arr[i]) && hmap.get(arr[i])==1)
          {
              lis.add(arr[i]);
          }
        }
        return lis;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of element");
		int n= sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter element");
		for (int i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		printNonRepeated(a,n);
	}

}
