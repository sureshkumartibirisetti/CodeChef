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
		    int l=in.nextInt();
		    int r=in.nextInt();
		    int count =0;
		    for (int i=l;i<=r;i++){
		        int a=i%10;
		        if((a==2)||(a==3)||(a==9)){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
