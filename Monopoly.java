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
		while (T-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    int d=in.nextInt();
		  /*  int a1=Math.max(a,b);
		    int a2=Math.max(c,d);
		    int a3=Math.max(a1,a2); */
		    if ((d>(a+b+c))||(a>(b+c+d))||(b>(a+c+d))||(c>(a+b+d))){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
