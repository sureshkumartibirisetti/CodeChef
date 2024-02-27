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
		    int X=in.nextInt();
		    int Y=in.nextInt();
		    int Z=in.nextInt();
		    int b=Y/X;
		    if (b>Z){
		        System.out.println(0);
		    }else{
		        System.out.println(Z-b);
		    }
		}

	}
}
