import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int i=sc.nextInt();
		while(i-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int count=0;
		    if (y%x==0){
		        System.out.println((y/x)-1);
		    }else{
		        System.out.println(y/x);
		    }

	}
}
}
