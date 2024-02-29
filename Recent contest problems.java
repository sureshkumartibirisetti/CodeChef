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
		    String[] arr=new String[N];
		    for (int i=0;i<N;i++){
		        arr[i]=in.next();
		    }
		    int a=0;
		    int b=0;
		    String s="START38";
		    for (String j:arr){
		        if(Objects.equals(s, j)){
		            a++;
		        }else{
		            b++;
		        }
		    }
		    System.out.println(a+" "+b);
		}

	}
}
