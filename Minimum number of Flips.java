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
		    int[] arr=new int[a];
		    for (int i=0;i<a;i++){
		        arr[i]=in.nextInt();
		    }if(a%2!=0){
		        System.out.println(-1);
		    }else{
		        int d=a/2;
		        int c=0;
		        for (int i=0;i<a;i++){
		            if (arr[i]==-1){
		                c++;
		            }
		        }
		        int e=Math.abs(d-c);
		        System.out.println(e);
		    }
		    

	}
}
}
