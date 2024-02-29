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
		    int a=0;
		    int j=0;
		    for(int i=1;i<=22;i++){
		        int a1=in.nextInt();
		        int a2=in.nextInt();
		        int c=a1+(a2*20);
		        if (a<c){
		            a=c;
		            j=i;
		        }
		    }
		    System.out.println(j);
		}

	}
}
