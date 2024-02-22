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
		    int a1=a+c;
		    int a2=a+d;
		    int b1=b+c;
		    int b2=b+d;
		    int z1=Math.max(a1,a2);
		    int z2=Math.max(b1,b2);
		    System.out.println(Math.max(z1,z2));
	}
	}
	
}
