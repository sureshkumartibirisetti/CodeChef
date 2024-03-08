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
		    String s=in.next();
		    if(4>N){
		        System.out.println("YES");
		    }else{
		        int count=0;
		        for(int i=0;i<s.length();i++){
		            if(count==4){
		                break;
		            }
		            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
		                count=0;
		            }else{
		                count++;
		            }
		        }
		        if(count==4){
		        System.out.println("NO");
		        }else{
		        System.out.println("YES");
		       }
		    
		    }
		    
		}

	}
}
