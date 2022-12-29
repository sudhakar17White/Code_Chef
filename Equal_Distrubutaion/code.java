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
		
		if(T>=1&&T<=1000)
		{ 
		    
		    
		    for(int i=0;i<T;i++)
		    { 
		        
		        
		        int a=s.nextInt();int b=s.nextInt();
		        
		        if(a==b)
		        { 
		            
		            System.out.println("YES");
		            
		        }
		        else
		        { 
		            
		            a=a+1;
		            b=b-1;
		            
		            if(a==b)
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
