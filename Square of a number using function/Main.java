#include<stdio.h>
int sqno(int n);
int main() {
   int n;
  scanf("%d",&n);
  printf("%d",sqno(n));
   return 0;
}
int sqno(int num)
{
  int result = num*num;
  return result;
}
  