#include <stdio.h>
int main() {
	int n,secdig;
  scanf("%d",&n);
  while(n >= 100)
  {
    n /= 10;
  }
  secdig = n % 10;
  printf("%d",secdig);
	return 0;
}