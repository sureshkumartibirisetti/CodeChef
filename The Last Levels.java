import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-- > 0){
		    int x = in.nextInt();
		    int y = in.nextInt();
		    int z = in.nextInt();
		    
		    if(x % 3 != 0){
		        int Br = x / 3;
		        System.out.println(x*y + (Br*z));
		        
		    }else if(x % 3 == 0){
		        int Br = (x / 3) - 1;
		        System.out.println(x*y + (Br*z));
		        
		    }else{
		        System.out.println(x*y);
		        
		    }
		}

	}
}
