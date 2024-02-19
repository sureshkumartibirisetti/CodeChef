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
		    int d=a-b;
		    if (c<=((b*3)-d)){
		        System.out.println("PASS");
		    }else{
		        System.out.println("FAIL");
		    }
		}

	}
}
