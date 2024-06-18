
    import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		long  n=sc.nextLong();
		long q=sc.nextLong();
		long a[]=new long[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextLong();
		}
		while(q-->0){
		    long x=sc.nextLong();
		    long ans=1;
		    for(int i=0;i<n;i++){
		        ans*=x-a[i];
		        
		    }
		    if(ans>0){
		    System.out.println("POSITIVE");
		    }else if(ans<0){
		        System.out.println("NEGATIVE");
		    }
		    else{
		        System.out.println("0");
		    }
		}
	}
}
    

