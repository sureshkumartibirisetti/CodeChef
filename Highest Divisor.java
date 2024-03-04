import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int a=0;
		for (int i=1;i<=10;i++){
		    if(N%i==0){
		        a=i;
		    }
		}
		System.out.println(a);

	}
}
