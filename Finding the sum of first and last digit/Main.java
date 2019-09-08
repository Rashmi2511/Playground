#include <stdio.h>
int main() {
	int n,temp,firdig,lastdig,sum;
  scanf("%d",&n);
  temp = n;
  lastdig = n % 10;
  while(n >= 10)
  {
    n /=10;
  }
  firdig = n;
  sum = firdig + lastdig;
  printf("%d",sum);
  
	return 0;
}