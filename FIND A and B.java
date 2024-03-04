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
		    int x=in.nextInt();
		    int y=in.nextInt();
		    int z=in.nextInt();
		    int a=x*y;
		    int b=y*z;
		    int c=x*z;
		    if(a%z==0)
		    System.out.println(a+" "+z);
		    else if(b%x==0)
		    System.out.println(b+" "+x);
		    else if(c%y==0)
		    System.out.println(c+" "+y);
		    else
		    System.out.println(-1);
		}

	}
}
