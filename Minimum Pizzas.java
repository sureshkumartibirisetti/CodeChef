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
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=a*b;
		    if (c%4==0){
		        System.out.println(c/4);
		    }else{
		        System.out.println((c/4)+1);
		    }
		}

	}
}
