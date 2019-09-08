#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[20];
  int i,j;
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  printf("%d",sum_sub(arr,n));
  return 0;
}
int sum_sub(int arr[],int n)
{
  int run_sum,max_sum_sub,i;
  run_sum=arr[0];
  max_sum_sub=arr[0];
  for(i=1;i<n;i++)
  {
    if(arr[i]>arr[i-1])
    {
      run_sum+=arr[i];
    }
    else
    {
      run_sum=arr[i];
    }
    if(run_sum>max_sum_sub)
    {
      max_sum_sub=run_sum;
    }
  }
  return max_sum_sub;
}