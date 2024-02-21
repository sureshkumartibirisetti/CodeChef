import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int H=in.nextInt();
		if(H<8){
		    System.out.println("LESS");
		}else if(H==8){
		    System.out.println("PERFECT");
		}else{
		    System.out.println("MORE");
		}

	}
}
