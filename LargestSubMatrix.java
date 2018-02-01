/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k = 0;k < t;k++) {
		    
    		int n = sc.nextInt();
    		int m = sc.nextInt();
    		int c[][] = new int[n][m];	
    		int l[][] = new int[n][m];
    		int max = 0;
    		for(int i = 0;i < n;i++) {
    		    for(int j = 0;j < m;j++) {
    		        c[i][j] = sc.nextInt();
    		        if(i == 0 || j == 0) 
    		            l[i][j] = c[i][j];
    		        if(c[i][j] > max)
    		            max = c[i][j];
    		        //System.out.print(c[i][j]);
    		    }
    		    //System.out.println();
    		}
    		
		    for(int i = 1;i < n;i++) {
		        for(int j = 1;j < m;j++) {
		            if(c[i][j] == 0) {
		                l[i][j] = 0;
		            } else {
		                l[i][j] = Math.min(l[i-1][j],Math.min(l[i][j-1],l[i-1][j-1])) + 1;
		            }
		            if(l[i][j] > max) 
		                max = l[i][j];
		            //System.out.print(l[i][j]);
		        }
		        //System.out.println();
		    }
		    System.out.println(max);
		}

	}
}
