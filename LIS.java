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
    		int a[] = new int[n];
    		int l[] = new int[n];
    		
    		/* Read the input array and initialize the answer array l[].*/
    		for (int i = 0;i < n;i++) {
    		    a[i] = sc.nextInt();
    		    l[i] = 1;
    		}
    		int overall_max = 0;
    		for(int i = n-2;i >= 0;i--) {
    		    int max = 1;
    		    for(int j = i+1;j < n;j++) {
    		        if(a[j] > a[i]) {

    		            l[i] = l[j] + 1;
     		            if(max < l[i])
    		                max = l[i];
    		        }
    		    }
    		    l[i] = max;
    		    if(max > overall_max) 
    		        overall_max = max;
    		}
		    System.out.println(overall_max);
		}

		
	}
}
