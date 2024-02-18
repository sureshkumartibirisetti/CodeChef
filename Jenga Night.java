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
		    if(a>b){
		        System.out.println("NO");
		    }else if(b%a==0){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}

	}
}
