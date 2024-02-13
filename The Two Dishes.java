import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for (int i=0;i<testCase;i++){
		    int n=sc.nextInt();
		    int s=sc.nextInt();
		    if (s<=n){
		        System.out.println(s);
		    }else{
		        System.out.println(Math.min(s,2*n-s));
		    }
		}

	}
}
