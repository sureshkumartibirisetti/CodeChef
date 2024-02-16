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
		    int a1=in.nextInt();
		    int b1=in.nextInt();
		    int a2=in.nextInt();
		    int b2=in.nextInt();
		    if((a==a1 || a==b1) && (b==a1 || b==b1)){
		        System.out.println(1);
		    }
		    else if((a==a2 || a==b2) && (b==a2 || b==b2)){
		        System.out.println(2);
		    }
		    else{
		        System.out.println(0);
		    }
		}

	}
}
