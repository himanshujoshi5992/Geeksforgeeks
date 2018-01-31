#include<stdio.h>
int main()
{
	int t;
	scanf("%d", &t);
	for(int j = 0;j < t;j++) {
	    int n;
	    scanf("%d", &n);
	    int a[n];
	    for(int i = 0;i < n;i++) {
	        scanf("%d", &a[i]);
	    }
	    int s = a[0];
	    int max_sum = a[0];
	    for(int i = 1;i < n;i++) {

	        if(s < 0)
	            s = 0;
	        s += a[i];
	        
	        if(s > max_sum) 
	            max_sum = s;
	        
	       
	    }
	    printf("%d\n", max_sum);
	}
	return 0;
}
