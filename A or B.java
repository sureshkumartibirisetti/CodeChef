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
		    int X=in.nextInt();
		    int Y=in.nextInt();
		    int AtoB=((500-(X*2))+(1000-((X+Y)*4)));
		    int BtoA=((1000-(Y*4))+(500-((X+Y)*2)));
		    if(AtoB<BtoA){
		        System.out.println(BtoA);
		    }else{
		        System.out.println(AtoB);
		    }
		}

	}
}
