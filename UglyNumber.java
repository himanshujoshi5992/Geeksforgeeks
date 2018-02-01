/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i = 0;i < t;i++) {
	        long n = sc.nextLong();
	        long a = (long)((n/2) + (n/3) + (n/5) + (n/7) + (n/30) + (n/42) + (n/105) + (n/70));
	        long b = (long)((n/6) + (n/10) + (n/14) + (n/15) + (n/21) + (n/35) + (n/210));
	        long number = n-(a-b);
	        System.out.println(number);
	    }
	}
}
