import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner (System.in);
		int T=in.nextInt();
		while(T-->0){
		    int a=in.nextInt();
		    int[] arr=new int[a];
		    for(int i=0;i<a;i++){
		        arr[i]=in.nextInt();
		    }
		    int count=0;
		    for(int i:arr){
		        if(i>=1000){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
