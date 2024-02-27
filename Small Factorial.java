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
		    int b=1;
		    for (int i=1;i<=a;i++){
		        b*=i;
		    }
		    System.out.println(b);
		}

	}
}
