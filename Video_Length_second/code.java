import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the movie length :");
		
		String movieLen=s.nextLine();
		
		int len=movieLen.length();
		
		String mins="";
		String sec="";
		
		String check="";
		
		for(int i=0;i<len;i++)
		{ 
		    
		    char a=movieLen.charAt(i);
		    
		    check=check+a;
		    
		    if(check.equals(":"))
		    { 
		        
		        
		        mins=movieLen.substring(0,i);
		        
		        sec=movieLen.substring(i+1,len);
		        
		        
		    }
		    check="";
		    
		    
		}
		
		int min=Integer.parseInt(mins);
		
		int se=Integer.parseInt(sec);
		
		int tot=min*60;
		
		tot=tot+se;
		
		System.out.println(tot);
		
	}
}
