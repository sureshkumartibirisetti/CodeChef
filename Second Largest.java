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
		    int[] arr=new int[3];
		    for (int i=0;i<3;i++){
		        arr[i]=in.nextInt();
		    }
		    Arrays.sort(arr);
		    System.out.println(arr[1]);
		}

	}
}
