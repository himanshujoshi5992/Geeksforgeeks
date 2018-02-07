/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0;k < t;k++) {
		    int m = sc.nextInt();
		    int a[] = new int[m];
		    for (int j = 0;j < m;j++) {
		        a[j] = sc.nextInt();
		    }
		    int n = sc.nextInt();
		    int c[][] = new int[n+1][m];
		    for (int i = 0;i < m;i++) 
		        c[0][i] = 1;
		    int x,y;
		    for (int i = 1;i < n+1;i++) {
		        for (int j = 0;j < m;j++) {
		            x = (i - a[j] >= 0)?c[i-a[j]][j]:0;
		            y = (j >= 1)?c[i][j-1]:0;
		            c[i][j] = x + y;
		        }
		    }
		    System.out.println(c[n][m-1]);
		}
	}
}
