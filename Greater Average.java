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
		while(testCase-->0){
		    float A=in.nextFloat();
		    float B=in.nextFloat();
		    float C=in.nextFloat();
		    float avg=(A+B)/2;
		    if (avg>C){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}

	}
}
