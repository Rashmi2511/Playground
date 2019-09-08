#include<stdio.h>
int sumof(int num);
int main() {
  int n;
  scanf("%d",&n);
  printf("%d",sumof(n));
  return 0;
}
int sumof(int num)
{
  int sum=0;
  for(int i=1;i<=num;i++)
  {
    sum = sum + i;
  }
  return sum;
}