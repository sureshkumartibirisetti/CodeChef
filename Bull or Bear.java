import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int testCase=in.nextInt();
		for (int i=0;i<testCase;i++){
		    int stock=in.nextInt();
		    int sold=in.nextInt();
		    if(stock>sold){
		        System.out.println("LOSS");
		    }else if(stock==sold){
		        System.out.println("NEUTRAL");
		    }else{
		        System.out.println("PROFIT");
		    }
		}
          }
}
