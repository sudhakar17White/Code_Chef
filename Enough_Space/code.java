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
		  
		  for(int i=0;i<T;i++)
		  {
		      
		      int a=s.nextInt();int b=s.nextInt();int c=s.nextInt();
		      
		      if(a>=1&&a<=100||b>=1&&b<=100||c>=1&&c<=100)
		      { 
		          
		          int t=b+(c*2);
		          
		          if(a==t)
		          { 
		              
		              System.out.println("YES");
		              
		              
		          }
		          else
		          { 
		              
		            if(a>b)
		             { 
		              
		              System.out.println("YES");
		              
		             }
		             else
		             { 
		              
		              System.out.println("NO");
		              
		             }
		              
		          }
		          
		          
		          
		          
		          
		      }
		      
		      
		  }
		  
		    
		}
		
		
	}
}
