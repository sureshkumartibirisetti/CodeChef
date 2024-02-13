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
		    int y=in.nextInt();
		    if (y%x==0){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
