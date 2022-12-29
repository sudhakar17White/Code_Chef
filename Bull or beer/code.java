/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner s=new Scanner(System.in);
		
		int T=s.nextInt();
		
		for(int i=0;i<T;i++)
		{ 
		    
		    int a=s.nextInt();int b=s.nextInt();
		    
		    if(a>=1&&a<=100||b>=1&&b<=100)
		    {
		    
		    if(a==b)
		    {
		        
		        System.out.println("NEUTRAL");
		        
		    }
		    else if(b<a)
		    { 
		        
		        System.out.println("LOSS");
		        
		    }
		    else
		    { 
		        
		        System.out.println("PROFIT");
		        
		    }
		    
		    }
		    
		    
		    
		}
		
		
	}
}
