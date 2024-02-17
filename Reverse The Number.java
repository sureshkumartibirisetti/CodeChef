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
		    int b=0;          //5
		    while(a>0){        //1234
		        int rem=a%10; //5  //4
		        a=a/10;       //1234  123
		        b=(b*10)+rem ;      //b=5   20
		    }
		    System.out.println(b);
		}

	}
}
