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
		    int A=in.nextInt();
		    int B=in.nextInt();
		    int C=in.nextInt();
		    int D=in.nextInt();
		    if((A+C)==180 && (B+D)==180){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}

	}
}
