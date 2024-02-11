import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while (t-->0){
		    int n=in.nextInt();
		    int x=in.nextInt();
		    if (n%6==0){
		        System.out.println((n/6)*x);
		    }else{
		        System.out.println((n/6+1)*x);
		    }
		}
	}
}
