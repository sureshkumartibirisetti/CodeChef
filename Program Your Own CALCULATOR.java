import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		float a=in.nextInt();
		float b=in.nextInt();
		String o=in.next();
		if(o.equals("+")){
		    System.out.println(a+b);
		}else if(o.equals("-")){
		    System.out.println(a-b);
		}else if(o.equals("/")){
		    System.out.println((a*1.0)/b);
		}else if(o.equals("*")){
		    System.out.println(a*b);
		}

	}
}
