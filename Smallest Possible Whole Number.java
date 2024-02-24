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
		    int n=in.nextInt();
		    int k=in.nextInt();
		    if(k==0)
		    System.out.println(n);
		    else
		    System.out.println(n%k);

	}
}
}
