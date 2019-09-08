#include<stdio.h>
int increasing(int n,int arr[],int sum[]);
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int sum[3*n];
  increasing(n,arr,sum);
 return 0;
}
int increasing(int n,int arr[],int sum[])
{
  for(int i1=0;i1<=n-1;i1++)
  {
    int key=arr[i1];
      for(int i2=i1+1;i2<=n-1;i2++)
      {
        if(arr[i2]>key)
          printf("%d,%d\n",key,arr[i2]);
      }
  }
  return 0;
}