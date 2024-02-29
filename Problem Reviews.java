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
		    int [] arr=new int[N];
		    for (int i=0;i<N;i++){
		        arr[i]=in.nextInt();
		    }
		    int count=0;
		    for (int j:arr){
		        if(4>=j){
		            count++;
		        }
		    }
		    if(count==0){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}

	}
}
