import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		//2,3,9
	    
	    //pretty numbers
	    int count=0;
	    
	    System.out.println("Enter the pretty number:");
	    String num=s.nextLine();
	    
	    
	    int size=num.length();
	    
	    int pr[]=new int[size];
	    
	    for(int i=0;i<size;i++)
	    { 
	        
	        
	        char a=num.charAt(i);
	        String con=""+a;
	        
	        pr[i]=Integer.parseInt(con);
	        
	        con="";
	        
	        
	    }
	   
	   
	   System.out.println(Arrays.toString(pr));
	   
	    System.out.println("Enter the start number");
	    int st=s.nextInt();
	    
	    System.out.println("Enter the end value:");
	    int en=s.nextInt();
	
	    int i=0;
	
	    for(i=st;i<=en;i++)
	    { 
	        
	        int t=i%10;
	            
	        for(int j=0;j<size;j++)
	        { 
	            
	            if(t==pr[j])
	            { 
	                
	                count++;
	                
	                
	            }
	            
	               
	        }  
	        
	        
	    }
	    
	    
	    System.out.println(count);
	    
	}
}