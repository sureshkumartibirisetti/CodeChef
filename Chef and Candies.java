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
		    if (a<b){
		        System.out.println(0);
		    }else if((a-b)%4!=0){
		        System.out.println(((a-b)/4)+1);
		    }else{
		        System.out.println((a-b)/4);
		    }
		}

	}
}
