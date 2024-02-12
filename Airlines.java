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
		while (T-->0){
		    int x=in.nextInt();
		    int n=in.nextInt();
		     int planesNeeded = (n + 99) / 100;

            // Calculate the additional planes needed
            int additionalPlanes = planesNeeded - x;

            // Output the result for each test case
            System.out.println(Math.max(0, additionalPlanes));
		}

	}
}
