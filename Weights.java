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
		    int w=in.nextInt();
		    int x=in.nextInt();
		    int y=in.nextInt();
		    int z=in.nextInt();
		    if ((w==x)||(w==y)||(w==z)||(w==(x+y))||(w==(y+z))||(w==(x+z))||(w==(x+y+z))){
		       System.out.println("YES"); 
		    }else{
		        System.out.println("NO");
		    }
		}

	}
}
