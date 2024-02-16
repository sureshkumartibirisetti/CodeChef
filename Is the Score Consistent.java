import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner (System.in);
		int T=in.nextInt();
		while(T-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    int d=in.nextInt();
		    if ((c>=a) && (d>=b)){
		        System.out.println("POSSIBLE");
		    }
		    else{
		        System.out.println("IMPOSSIBLE");
		    }
		}

	}
}
