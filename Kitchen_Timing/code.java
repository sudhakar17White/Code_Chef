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
		/*int one[]=new int[T];
		int two[]=new int[T];
		*/
		if(T>=1&&T<=100)
		{ 
		    
		    for(int i=0;i<T;i++)
		    { 
		        
		        int a=s.nextInt();int b=s.nextInt();
		        
		        if(a>=1&&a<=12||b>=1&&b<=12)
		        {
		        
		        int c=b-a;
		        
		        System.out.println(c);
		        
		            
		        }
		        
		    }
		    
		    
		}
		
		
	}
}
