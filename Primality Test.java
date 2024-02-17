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
		    int count=0;
		    for(int i=1;i<=a;i++){
		        if(a%i==0){
		            count++;
		        }
		    }
		    if (count==2){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		}

	}
}
