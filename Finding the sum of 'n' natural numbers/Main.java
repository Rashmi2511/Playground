#include <stdio.h>
#include<stdlib.h>
int add(int n);
int main()
{ 
  int n;
  scanf("%d",&n);
  printf("%d",add(n));
  return 0;
}
int add(int n)
{
  if(n!=0)
    return n + add(n-1);
  else
    return n;
}