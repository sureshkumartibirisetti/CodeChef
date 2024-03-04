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
		    int a1=a/2;
		    if(a1>b){
		        System.out.println(b);
		    }else{
		        System.out.println(a1);
		    }
		}

	}
}
