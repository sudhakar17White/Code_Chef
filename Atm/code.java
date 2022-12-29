import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the withdrwal amount:");
		int x=s.nextInt();
		
		System.out.println("Acoount balance:");
		int y=s.nextInt();
		
		if(x<y)
		{ 
		    
		    int tot=y-x;
		    
		    Double t=tot-0.50;
		    
		    System.out.println(t);
		    
		    
		    
		}
		else
		{ 
		    
		    System.out.println("Insufficent balance.");
		    
		}
	    
	}
}
