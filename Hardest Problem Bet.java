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
		    int c=in.nextInt();
		    if (a<b && a<c){
		        System.out.println("Draw");
		    }else if (b<a && b<c){
		        System.out.println("Bob");
		    }else{
		        System.out.println("Alice");
		    }
		}
	}
}
