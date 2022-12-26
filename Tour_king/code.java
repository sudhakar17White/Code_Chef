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
		
		if(T>=1&&T<=100)
		{ 
		    
		    //set the first value multiple 5 nad second value multiple ith 7
		    
		    
		    for(int i=0;i<T;i++)
		    { 
		        
		        int n=s.nextInt();int m=s.nextInt();
		        
		        
		        if(n>=1&&n<=100||m>=1&&m<=100)
		        { 
		            
		            
		            System.out.println((n*5)+(m*7));
		            
		            
		        }
		        
		        
		        
		    }
		    
		    
		}
		
	}
}
