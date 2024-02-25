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
		    int K=in.nextInt();
		    int k=K+1;
		    int a=(int)(N/k);
		    if (N<K){
		        System.out.println(N);
		    }else{
		        System.out.println(N-(K*a));
		    }
		}

	}
}
