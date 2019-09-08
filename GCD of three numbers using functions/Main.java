#include <stdio.h>
int main() {
	int a,b;
  scanf("%d%d",&a,&b);
  printf("%d",gcd(a,b));
	return 0;
}
int gcd(long a,long b)
{
  if(b==0)
    return a;
  else
    return gcd(b,a%b);
}