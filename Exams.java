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
		    int x=in.nextInt();
		    int y=in.nextInt();
		    int z=in.nextInt();
		    if ((x*y)/2<z){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}

	}
}
