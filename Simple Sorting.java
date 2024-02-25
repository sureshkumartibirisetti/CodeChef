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
		int[] arr=new int[T];
		for (int i=0;i<T;i++){
		    arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		for(int j=0;j<arr.length;j++){
		    System.out.println(arr[j]);
		}

	}
}
