import java.util.*;

class NumString
{ 
    Scanner s=new Scanner(System.in);
    String a[];
   
    void arrayCreation(int size)
    {
        a=new String[size];
        
        System.out.println("Array will create with "+size+" size.");
        
      
        
        for(int i=0;i<size;i++)
        { 
            
            a[i]=s.nextLine();
            
            
        }
        
       
        
    }
    void opeartion(int size)
    { 
        
        String check="";
          String check2="";
        // array loop
        for(int i=0;i<size;i++)
        {
            String c=a[i];
            
         for(int k=0;k<c.length();k++)
        {
                
            char ar=c.charAt(k);
            
            check=check+ar;
            
            
            for(int j=0;j<=9;j++)
            { 
                
              check2=String.valueOf(j);
                
                if(check2.equals(check))
                {
                    
                    System.out.println(a[i]);
                    break;
                }
              check2="";
                
            }
        
            check="";
        }
        
        }
        
        
    }
    
    void printar(int size)
    {
        
        for(int i=0;i<size;i++)
        {
        
            System.out.println(a[i]);
    
        }
        
    }
    
    
    
    
}

public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
        	
	    NumString ns=new NumString();
	    
	    ns.arrayCreation(size);
	    
	    System.out.println("String with number elements :");
	    //ns.printar(size);
	    
	    ns.opeartion(size);
	    
	    
	}
}
