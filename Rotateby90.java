package matrixandstring;

import java.util.Scanner;

public class Rotateby90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
        try {
        	System.out.println("enter no. of rows and column");
    		int m1= sc.nextInt();
    		
    		int arr[][] = new int[m1][m1];
    		System.out.println("enter elements of array");
    		for (int i=0;i<m1;i++)
    		{
    			for (int j=0;j<m1;j++)
    			{
    				arr[i][j]= sc.nextInt();
    			}
    			
    		}
    		System.out.println("matrix is ");
    		for (int i=0;i<m1;i++)
    		{
    			for (int j=0;j<m1;j++)
    			{
    				System.out.print(" "+arr[i][j]);
    			}
    			System.out.println();
    		}
    		
    		
    		for (int i=0;i<m1;i++) //transpose of matrix 
    		{
    			for (int j=i;j<m1;j++)
    			{
    				if(i!=j)
    				{
    					int temp = arr[i][j];
        				arr[i][j] = arr[j][i];
        				arr[j][i]  = temp;
    				}
    			}
    		}
    		System.out.println("after tranpose ");
    		for (int i=0;i<m1;i++)
    		{
    			for (int j=0;j<m1;j++)
    			{
    				System.out.print(" "+arr[i][j]);
    			}
    			System.out.println();
    		}
    		
    		for (int i=0;i<m1/2;i++) //rotate by 90 
    		{
    			for (int j=0;j<m1;j++)
    			{
    				int temp = arr[i][j];
    				arr[i][j] = arr[m1-i-1][j];
    				arr[m1-i-1][j] = temp;
    			}
    		}
    		
    		
    		
    		
    		System.out.println("after rotattion by 90 ");
    		for (int i=0;i<m1;i++)
    		{
    			for (int j=0;j<m1;j++)
    			{
    				System.out.print(" "+arr[i][j]);
    			}
    			System.out.println();
    		}
    		
    			
    		
        }finally {
        	sc.close(); }

	}

}
