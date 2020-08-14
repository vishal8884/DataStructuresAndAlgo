import java.util.*;

public class fd
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<n;i++)
        {
            int ele = sc.nextInt();
            
            ArrayList<Integer> ls = new ArrayList<Integer>();
            
            for(int j=0;j<ele;j++)
            {
                ls.add(sc.nextInt());
            }
            
            list.add(ls);
        }
        
        int query = sc.nextInt();
        
        for(int i=0;i<query;i++)
        {
            int f = sc.nextInt()-1;
            int s = sc.nextInt()-1;
            
            try
            {
                ArrayList ls = list.get(f);
                System.out.println(ls.get(s));    
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");    
            }
        }
            
        
    }
    
}