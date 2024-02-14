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
		while(t-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    if ((a+b)%2!=0||(b+c)%2!=0){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
    }

	}
}
