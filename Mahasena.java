import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int count=0;
		int count1=0;
		while(t-->0){
		    int a=in.nextInt();
		    if(a%2==0){
		        count++;
		    }else{
		        count1++;
		    }
		}
		if (count>count1){
		    System.out.println("READY FOR BATTLE");
		}else{
		    System.out.println("NOT READY");
		}

	}
}
