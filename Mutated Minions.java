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
		    int count=0;
		    while(a-->0){
		        int c=in.nextInt();
		        if((b+c)%7==0){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
