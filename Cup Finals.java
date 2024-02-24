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
		    int c=in.nextInt();
		    String ans=team(a,b,c);
		    System.out.println(ans);
		}

	}
	static String team(int a,int b,int c){
	    if(Math.abs(a-b)<=c){
	        return "YES";
	    }else{
	        return "NO";
	    }
	}
}
