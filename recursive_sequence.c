#include <stdio.h>

int temp;
static long int sv = 1;
long int rec(int i) {
    //printf("Value of sv: %ld\n", sv);
    if(i) {
        return (sv++) * rec(--i);
    } else
        return 1;
}
int main() {
	int t,n;
	long int val = 0;
	scanf("%d",&t);
	for(int j = 0;j < t;j++) {
	    scanf("%d", &n);
	    for(int i = 1;i <= n;i++) {
	        temp = i;
	        val += rec(i);
	        //printf("Value of val after every iteration: %ld\n",val);
	        
	    } 
	    printf("%ld\n",val);
	    val = 0;
	    sv = 1;
	}
	return 0;
}