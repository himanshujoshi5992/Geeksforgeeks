#include <stdio.h>

int max_dia,n;

int max(int a,int b) {
	if(a > b)
		return a;
	else 
		return b;
}

int max_diameter(int *a,int i) {
	int maxp,maxd;
	if(i > n) 
		return 0;
	else {
		int left_tree = max_diameter(a,2*i);
		int right_tree = max_diameter(a,2*i+1);

		maxp = max(left_tree,right_tree) + a[i];
		maxd = a[i] + left_tree + right_tree;
		if(max_dia <= maxd)
			max_dia = maxd;
		return maxp;
	}
}



int main() {
	int a[100];
	scanf("%d", &n);
	for(int i = 1;i <= n;i++) {
		scanf("%d", &a[i]);
	}
	int result = max_diameter(a,1);
	printf("%d\n", max_dia);
}
