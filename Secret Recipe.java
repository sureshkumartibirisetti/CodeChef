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
		    float X1=in.nextInt();
		    float X2=in.nextInt();
		    float X3=in.nextInt();
		    float V1=in.nextInt();
		    float V2=in.nextInt();
		    float a=X3-X1;
		    float b=X2-X3;
		    float a1=a/V1;
		    float b1=b/V2;
		    if(a1<b1){
		        System.out.println("Chef");
		    }else if(a1>b1){
		        System.out.println("Kefa");
		    }else{
		        System.out.println("Draw");
		    }
		}

	}
}
