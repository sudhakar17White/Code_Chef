import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size:");
		int size=s.nextInt();
		int pnum;
		int nnum=0;
		for(int i=0;i<size;i++)
		{ 
		    System.out.println("\nEnter the robot move:");
		    String move=s.next();
		    
		    System.out.println("Enter number:");
		    int num=s.nextInt();
		    
		   
		    
		    int len=move.length();
		    
		    
		    
		    String check="";
		    pnum=num;
		    
		    for(int j=0;j<len;j++)
		    { 
		        
		        char a=move.charAt(j);
		        check=check+a;
		        
		        if(check.equals("R"))
		        { 
		            
		            
		            pnum=pnum+1;
		            
		            System.out.print(pnum+"-->");
		            
		        }
		        
		        check="";
		        
		    }
		    
		    nnum=pnum;
		  
		    System.out.println(nnum);
		  
		    for(int j=0;j<len;j++)
		    { 
		        
		        char a=move.charAt(j);
		        check=check+a;
		        
		        if(check.equals("L"))
		        { 
		            
		            
		              
		            nnum=nnum-1;
		            System.out.print(nnum+"-->");
		            
		        }
		        
		        check="";
		        
		    }
		    
		    
		    
		    pnum=0;
		    nnum=0;
		   
		}
		
	
	    
	}
}
