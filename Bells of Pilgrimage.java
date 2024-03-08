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
		    int X=in.nextInt();
		    int K=in.nextInt();
		    int P=in.nextInt();
		    if(K==0){
		        System.out.println(P);
		    }else if(X>=K){
		        System.out.println(P+(K*10));
		    }else{
		        if(K==N){
		            System.out.println(P+(X*10)+((K-X)*5)+20);
		        }else{
		            System.out.println(P+(X*10)+((K-X)*5));
		        }
		    }
		}

	}
}
