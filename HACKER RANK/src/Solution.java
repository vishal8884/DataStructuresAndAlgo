import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	
	
	public static long sumofs(int n,int[] arr)
	{
	      long result=0,temp=0,count=0;
	      
	      for(int i=0;i<n;i++)
	      {
	    	  temp=0;  // for temp loops again put value to zero when comes out
	    	  for(int j=i;j<n;j++)
	    	  {
	    		  temp+=arr[j];
	    		  if(temp<0)
	    		  {
	    			  count++;
	    		  }
	    		  System.out.println("temp : "+temp);
	    		  result+=temp;
	    		  System.out.println("result : "+result);
	    	  }
	      }
	      return count;
	}
	
	
	
	

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		long sol=sumofs(arr.length,arr);
		System.out.println(sol);
	}

}
