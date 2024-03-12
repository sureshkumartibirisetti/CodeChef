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
		if(1<=T && 50>=T){
		    System.out.println("100");
		}else if(51<=T && 100>=T){
		    System.out.println("50");
		}else{
		    System.out.println("0");
		}

	}
}
