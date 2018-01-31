import java.util.*;
import java.lang.*;
import java.io.*;

class CFG {
    static void find_lcs(String x,String y) {
        int n = x.length();
        int m = y.length();
        int L[][] = new int[n+1][m+1];
        for (int i = 0;i <= n;i++) {
            for (int j = 0;j <= m;j++) {
                if(i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if(x.charAt(i-1) == y.charAt(j-1)){
                    L[i][j] = 1 + L[i-1][j-1];
                } else {
                    L[i][j] = Math.max(L[i-1][j],L[i][j-1]);
                }
            }
        }
        System.out.println(L[n][m]);
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0;i < t;i++) {
            int n = scanner.nextInt(); // Not needed
            int m = scanner.nextInt(); // Not needed
            String x = scanner.next();
            String y = scanner.next();
            find_lcs(x,y);
        }
    }
}
