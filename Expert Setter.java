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
		    float a=in.nextFloat();
		    float b=in.nextFloat();
		    float c=(a/2);
		    if (c<=b){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}

	}
}
