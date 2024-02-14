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
		    double a=in.nextDouble();
		    double b=in.nextDouble();
		    if ((b/a)*100>=75){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}

	}
}
