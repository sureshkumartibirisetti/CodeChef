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
		while (T-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int ans=bath(a,b);
		    System.out.println(ans);
		}
	}
		static int bath(int a,int b){
		    if(a<(b*2)){
		        return 0;
		    }else{
		        return (a/(b*2));
		    }
		}
}
