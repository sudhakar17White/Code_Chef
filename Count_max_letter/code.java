import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s=new Scanner(System.in);
	    
	    String word=s.nextLine();
	    
	    int size=word.length();
	    
	    char a=0;
	    char b=0;
	    
	    int co=0;
	    
	    int count[]=new int[size];
	    
	    for(int i=0;i<size;i++)
	    { 
	        
	        a=word.charAt(i);
	        
	        
	        for(int j=0;j<size;j++)
	        { 
	            
	            
	            b=word.charAt(j);
	            
	            int com=Character.compare(a,b);

                //System.out.println(com);
                if(com==0)
                { 
                    
                    co++;
                   
                    
                }
                
                
	            
	        }
	        count[i]=co;
	        
	        // System.out.println(co);
	        co=0;
	        
	        
	        
	    }
	    
	    System.out.print(Arrays.toString(count));
	    
	    int max=count[0];
	    int pr=0;
	    
	    for(int i=1;i<size;i++)
	    { 
	        
	        if(count[i]>max)
	        { 
	            
	            max=count[i];
	            pr=i;
	            
	        }
	        
	        
	    }
	    
	    //System.out.println("\n"+max);
	    
	   // System.out.println(pr);
	    
	    char f=word.charAt(pr);
	    
	   
	    
	   // System.out.println(f);
	    System.out.println("\n");
	    for(int i=0;i<max;i++)
	    { 
	        
	        System.out.print(f+" ");
	        
	        
	    }
	
	    
	    
	}
}
