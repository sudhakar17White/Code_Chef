import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s=new Scanner(System.in);
	    
	    
	    
	    int mathstick[]={6,2,5,5,4,5,6,3,7,6};
	    
	    
	    int size=s.nextInt();
	    
	    int a=0;
	    int b=0;
	     int temp=0;
	        int val=0;
	        
	    for(int i=0;i<size;i++)
	    { 
	        
	        a=s.nextInt();
	        b=s.nextInt();
	        
	        int tot=a+b;
	        
	       // System.out.println(tot);
	        while(tot>0)
	        { 
	            
	            temp=tot%10;
	          //   System.out.println(temp);
	            for(int j=0;j<9;j++)
	            { 
	                
	                if(j==temp)
	                {
	                    val=val+mathstick[j];
	                }
	                
	            }
	            
	            tot=tot/10;
	            // System.out.println(tot);
	            
	        }
	        
	        System.out.println(val);
	         a=0;
	         b=0;
	         temp=0;
	         val=0;
	        
	    }
	    
	    
	    
	    
	    
	    
	}
}
