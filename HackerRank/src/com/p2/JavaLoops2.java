package com.p2;

import java.util.Scanner;

public class JavaLoops2 {
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter q");
		int q=sc.nextInt();
		int a,b,n;
		for(int i=0;i<q;i++)
		{
			//System.out.println("Enter a");
			a=sc.nextInt();
			//System.out.println("Enter b");
			b=sc.nextInt();
			//System.out.println("Enter n");
			n=sc.nextInt();
			
			int sum=0,temp=a,count=0,note=0;
		
	
			
			for(int j=1;j<n;j+=j)
			{
				
				
				temp+=(j*(1<<j));
				
				
				count++;
				//System.out.println("a="+a+"  b="+b+ "  n="+n);
				
				if(count<=n)
				{
				System.out.print(temp+" ");
				//System.out.println("sum:"+sum);
				
				}
				
			}
			
			
			
		}
	}

}
