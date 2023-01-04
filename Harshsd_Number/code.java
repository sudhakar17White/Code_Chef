import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter the NUmber:");
		
		String num=s.nextLine();
		
		int len=num.length();
		
		int divde=0;
		
		String no="";
		
		for(int i=0;i<len;i++)
		{ 
		    
		    
		    char n=num.charAt(i);
		    
		    no=no+n;
		    
		    divde=divde+Integer.parseInt(no);
		    
		    no="";
		    
		}
		//System.out.println(divde);
		
		int tot=((Integer.parseInt(num))%divde);
	
	    //System.out.println(tot);
	    
	    if(tot==0)
	    { 
	        
	        System.out.println("Excetly divde by "+divde);
	        
	    }
	    else
	    { 
	        
	        System.out.println("Not divde ");
	        
	    }
	    
	    
	    
	}
}
