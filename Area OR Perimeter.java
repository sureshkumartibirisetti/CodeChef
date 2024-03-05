import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int L=in.nextInt();
		int B=in.nextInt();
		int a=L*B;
		int p=2*(L+B);
		if(a<p){
		    System.out.println("Peri");
		    System.out.println(p);
		}else if(a>p){
		    System.out.println("Area");
		    System.out.println(a);
		}else{
		    System.out.println("Eq");
		    System.out.println(a);
		}

	}
}
