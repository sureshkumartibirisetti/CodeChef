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
		    for(int i=1;i<=20;i++){
		        int e=(int)Math.pow(2,i);
		        if (e==a){
		            System.out.println((i*b)+((i-1)*c));
		        }
		    
		    
		    }
		}

	}
}
