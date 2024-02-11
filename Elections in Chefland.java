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
		    int voters=in.nextInt();
		    int age=in.nextInt();
		    int count=0;
		    while(voters-->0){
		        int vote=in.nextInt();
		        if (vote>=age){
		            count++;
		        }
		        
		    }
		    System.out.println(count);
		}

	}
}
