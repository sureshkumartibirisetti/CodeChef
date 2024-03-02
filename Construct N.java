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
		    if(7<=N){
		        System.out.println("YES");
		    }else{
		        if(N%2==0)
		        System.out.println("YES");
		        else
		        System.out.println("NO");
		    }
		}

	}
}
