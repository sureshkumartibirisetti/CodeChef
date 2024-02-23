import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int a=in.nextInt();
		    String ans=sum(a);
		    System.out.println(ans);
		}

	}
	static String sum(int a){
	    if (a%3==0){
	        return "NORMAL";
	    }else if(a%3==1){
	        return "HUGE";
	    }else{
	        return "SMALL";
	    }
	}
}
