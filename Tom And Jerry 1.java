import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int T = Integer.parseInt(br.readLine().trim());  // Read the number of test cases
        
        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().trim().split(" ");
            int a = Integer.parseInt(input[0]);  // Tom's initial X coordinate
            int b = Integer.parseInt(input[1]);  // Tom's initial Y coordinate
            int c = Integer.parseInt(input[2]);  // Jerry's X coordinate
            int d = Integer.parseInt(input[3]);  // Jerry's Y coordinate
            int K = Integer.parseInt(input[4]);  // Number of steps that Tom can move
            
            int minSteps = Math.abs(c - a) + Math.abs(d - b);
            
            if (K >= minSteps && (K - minSteps) % 2 == 0) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        
        // Don't forget to flush and close the PrintWriter
        out.flush();
        out.close();

	}
}
