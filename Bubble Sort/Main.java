#include<stdio.h>
void bubblesort(int a[],int n)
{
  int i,j,temp;
  for(i=0;i<n;i++)
  {
    for(j=0;j<n-i-1;j++)
    {
      if(a[j]>a[j+1])
      {
        temp = a[j];
        a[j] = a[j+1];
        a[j+1] = temp;
      }
    }
  }
  for(i=0;i<n;i++)
  {
    printf("%d\n",a[i]);
  }
}
int main()
{
  int a[100],i,n,step,temp;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  bubblesort(a,n);
  return 0;
}