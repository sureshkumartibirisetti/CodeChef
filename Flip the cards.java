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
		    int ans=card(a,b);
		    System.out.println(ans);
		}

	}
	static int card(int a,int b){
	    if(a==b){
	        return 0;
	    }
	    else{
	        int c=a-b;
	        return (Math.min(c,b));
	    }
	}
}
