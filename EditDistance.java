import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int find_operations(String x, String y) {
        // System.out.println(x+" "+y);
        int n = x.length();
        int m = y.length();
        // System.out.println(n +" "+ m);
        int g[][] = new int[n+1][m+1];
        for(int i = 0;i < m+1;i++) 
            g[0][i] = i;
        for(int i = 0;i < n+1;i++)
            g[i][0] = i;
            
        for(int i = 1;i < n+1;i++) {
            for(int j = 1;j < m+1;j++) {
                if(x.charAt(i-1) == y.charAt(j-1)) 
                    g[i][j] = g[i-1][j-1];
                else {
                    g[i][j] = Math.min(g[i-1][j-1],Math.min(g[i][j-1],g[i-1][j])) + 1;
                }
                // System.out.print(g[i][j]+" ");
            }
            // System.out.println();
        }

        return g[n][m];
    }
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0;k < t;k++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            
            String y = sc.next();
            int operations = find_operations(x,y);
            System.out.println(operations);
        }
        
	}
}
