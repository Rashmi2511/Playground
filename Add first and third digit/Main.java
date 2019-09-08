#include<stdio.h>
int main()
{
 int n,fs,ls,sum;
  scanf("%d",&n);
  fs=n/100;
  ls=n%10;
  sum=fs+ls;
  printf("%d",sum);
  return 0;
}