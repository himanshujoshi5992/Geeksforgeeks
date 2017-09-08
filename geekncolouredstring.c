#include <stdio.h>

int fact(int num) {
    int factorial = 1;
    for(int i = 1;i <= num;i++) {
        factorial *= i;
    }
    return factorial;
}
int combinations(int n,int r,int g,int b) {
    int result;
    result = fact(n)/(fact(r) * fact(g) * fact(b));
    //return result;
}
int main() {
    int t;
	scanf("%d", &t);
    for(int j = 0;j < t;j++) {
        int r,g,b,n;
        long int factorial = 0,result = 0;
        scanf("%d%d%d%d",&n,&r,&g,&b);
        for(int i = 1;i <= n-r-g-b;i++) {
            factorial += combinations(n,i+r,g,b);
        }
        result += factorial;
        //printf("result1: %ld\n", result);
        factorial = 0;
        for(int i = 1;i <= n-r-g-b;i++) {
            factorial += combinations(n,r,i+g,b);
        }
        result += factorial;
        factorial = 0;
        //printf("result2: %ld\n", result);
        for(int i = 1;i <= n-r-g-b;i++) {
            factorial += combinations(n,r,g,i+b);
        }
        result += factorial;
        //printf("result3: %ld\n", result);
        printf("%ld",result);        
    }

	return 0;
}