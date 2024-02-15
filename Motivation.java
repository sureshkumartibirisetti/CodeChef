import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		while(T-->0){
		    int N=in.nextInt();
		    int X=in.nextInt();
		    int max=1;
		    while(N-->0){
		        int a=in.nextInt();
		        int b=in.nextInt();
		        if(a<=X){
		            max=Math.max(max,b);
		            
		        }
		       
		    }
		    System.out.println(max);
		}

	}
}
