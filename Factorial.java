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
		    int z=0;
		    for (int i=5;N/i>0;i*=5){
		        z+=N/i;
		    }
		    System.out.println(z);
		}

	}
}
