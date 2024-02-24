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
		    int L=in.nextInt();
		    int R=in.nextInt();
		    System.out.println((2*R)-(2*L)+1);
		}

	}
}
