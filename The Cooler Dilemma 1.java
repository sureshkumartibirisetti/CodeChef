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
		    int m=in.nextInt();
		    if((x*m)>=y){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		}

	}
}
