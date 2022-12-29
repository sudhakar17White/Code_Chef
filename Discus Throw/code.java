import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		
		for(int i=0;i<size;i++)
		{ 
		    
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=s.nextInt();
		    
		    if(a>=b&&a>=c)
		    { 
		        
		        System.out.println(a+" is large number");
		        
		    }
		    else if(b>=a&&b>=c)
		    { 
		        
		        
		        System.out.println(b+" is large number");
		        
		        
		    }
		    else
		    { 
		        
		        
		        System.out.println(c+" is large number");
		        
		        
		    }
		    
		}
		
	    
	}
}
