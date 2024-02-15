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
		    if ((a==0 && b==0)||((b==0)&&(c==0))||((a==0)&&(c==0))){
		        System.out.println("Water filling time");
		    }else{
		        System.out.println("Not now");
		    }
		}

	}
}
