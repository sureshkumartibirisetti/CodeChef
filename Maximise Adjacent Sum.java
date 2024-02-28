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
		    int N=in.nextInt();
		    int[] arr=new int[N];
		    for (int i=0;i<N;i++){
		        arr[i]=in.nextInt();
		    }
		    Arrays.sort(arr);
		    int tem=arr[N-1];
		    arr[N-1]=arr[1];
		    arr[1]=tem;
		    int b=0;
		    for (int j=0;j<arr.length-1;j++){
		        b+=arr[j]+arr[j+1];
		        
		    }
		    System.out.println(b);
		}

	}
}
