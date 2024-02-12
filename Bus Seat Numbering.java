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
		    int N=in.nextInt();
		    if (N<=10){
		        System.out.println("Lower Double");
		    }else if(11<=N && 15>=N){
		        System.out.println("Lower Single");
		    }else if(16<=N && 25>=N){
		        System.out.println("Upper Double");
		    }else{
		        System.out.println("Upper Single");
		    }
		}

	}
}
