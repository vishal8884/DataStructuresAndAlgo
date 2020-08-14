import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);   
		
		
		
		int n=0,d=0,q=0,x=0,y=0;
		boolean error1=false,error2=false;
		           
		System.out.println("Enter n");                            
		n= sc.nextInt();
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter d");
		d= sc.nextInt();
		num.add(d);
		
		//ArrayList<Integer> a1 = new ArrayList<Integer>();
		System.out.println("Enter d elements");
		   for(int j=0;j<d;j++)
		   {
			   
			   int dElements =sc.nextInt();
			   list.add(dElements);
			   
		   }
		 
		}
		
	//	ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		System.out.println("Enter the value of Q");
		q= sc.nextInt();
		for(int i=0;i<q;i++)
		{
			System.out.println("Enter x and y");
			 x=sc.nextInt();
			y=sc.nextInt();
			int sum=0;
			
			for(int l=0; l<x-1; l++){
                sum += num.get(l);
            }
			
			
			
			
			
		}
		
		  
		 
		
		/*
		 for (int i = 0; i < aList.size(); i++) { 
	            for (int j = 0; j < aList.get(i).size(); j++) { 
	                System.out.print(aList.get(i).get(j) + " "); 
	            } 
	            System.out.println(); 
	        } 
		 */
		 
		 
		
		
		
		

	}

}
/*
if(x>d || x<=0)
{
	error1=true;
	System.out.println("ERROR!");
	break;
}

for(int j=0;j<a1.size();j++)
{
	 if(y<=0 || y>a1.get(j))
	 {
		 error2=true;
		 System.out.println("ERROR!");
		 break;
	 }
}*/