import java.io.*;
import java.util.*;

public class Solution {
	
	static Scanner sc= new Scanner(System.in);
	
	
	public static long sumOfSubArray(int n,int[] arr)
	{
		long temp = 0,result=0;
		
		for(int i=0;i<n;i++)
		{
			 temp=0;
			for(int j=i;j<n;j++)
			{
				temp=temp+arr[j];
				System.out.println("temp:"+temp);
				result=result+temp;
				System.out.println("result:"+result);
			}
		}
		return result;
	}
	
	
	

    public static void main(String[] args) {
    	
    	 Scanner sc= new Scanner(System.in);
    	int n=sc.nextInt();
    	
    	
    	int[] arr= new int[n];
    	
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	
    	
    	System.out.println(Arrays.toString(arr));
    	
    	long sol= sumOfSubArray(arr.length,arr);
    	System.out.println(sol);
    	
    	
    	
    	
    	
    }
}