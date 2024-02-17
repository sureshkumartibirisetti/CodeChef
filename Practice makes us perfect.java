import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int[] arr=new int[4];
		for (int i=0;i<4;i++){
		    arr[i]=in.nextInt();
		}
		int count=0;
		for (int i=0;i<4;i++){
		    if (arr[i]>=10){
		        count++;
		    }
		}
		System.out.println(count);

	}
}
