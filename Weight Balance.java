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
		    int w1=in.nextInt();
		    int w2=in.nextInt();
		    int x1=in.nextInt();
		    int x2=in.nextInt();
		    int M=in.nextInt();
		    if((w2-w1)<(M*x1))
		        System.out.println(0);
		    else if((w2-w1)>(M*x2))
		        System.out.println(0);
		    else
		        System.out.println(1);
		}

	}
}
