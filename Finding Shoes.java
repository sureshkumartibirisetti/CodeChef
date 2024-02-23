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
		    int N=in.nextInt();
		    int M=in.nextInt();
		    int ans=Shoes(N,M);
		    System.out.println(ans);
		}

	}
	static int Shoes(int N,int M){
	    if (N<=M){
	        return N;
	    }
	    return((N*2)-M);
	}
}
