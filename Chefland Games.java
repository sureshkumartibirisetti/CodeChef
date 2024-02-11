import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int testCase=in.nextInt();
		while(testCase-->0){
		    int R1=in.nextInt();
		    int R2=in.nextInt();
		    int R3=in.nextInt();
		    int R4=in.nextInt();
		    if (R1==0 && R2==0 && R3==0 && R4==0){
		        System.out.println("IN");
		    }else{
		        System.out.println("OUT");
		    }
		}

	}
}
