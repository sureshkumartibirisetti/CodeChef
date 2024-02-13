import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int R1=in.nextInt();
		int R2=in.nextInt();
		int D1=in.nextInt();
		int D2=in.nextInt();
		int a=R1+D1;
		int b=R2+D2;
		if (a<b){
		    System.out.println("Everule");
		}else{
		    System.out.println("Dominater");
		}

	}
}
