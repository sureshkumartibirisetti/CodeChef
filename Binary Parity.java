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
		    int s=0;
		    while(N>0){
		        s+=N%2;
		        N=N/2;
		    }
		    if(s%2==0){
		        System.out.println("EVEN");
		    }else{
		        System.out.println("ODD");
		    }
		}

	}
}
