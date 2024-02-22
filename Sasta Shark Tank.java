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
		    int a=in.nextInt();
		    int b=in.nextInt();
		    if((a/10)==(b/20)){
		        System.out.println("ANY");
		    }else if((a/10)<(b/20)){
		        System.out.println("SECOND");
		    }else{
		        System.out.println("FIRST");
		    }
		    
		}

	}
}
