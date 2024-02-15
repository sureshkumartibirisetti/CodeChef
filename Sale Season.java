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
		    int X=in.nextInt();
		    if (X<=100){
		        System.out.println(X);
		    }else if((100<X)&&(X<=1000)){
		        System.out.println(X-25);
		    }else if((1000<X)&&(X<=5000)){
		        System.out.println(X-100);
		    }else{
		        System.out.println(X-500);
		    }
		}

	}
}
