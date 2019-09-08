#include<stdio.h>
int main()
{
  int arr_size;
  scanf("%d",&arr_size);
  int arr[10];
  for(int i=0;i<=arr_size-1;i++)
  {
    scanf("%d",&arr[i]);
  }
  int se1,se2;
  scanf("%d%d",&se1,&se2);
  int ei1=-1;
  int ei2=-1;
  for(int i=0;i<=arr_size-1;i++)
  {
    if(se1==arr[i])
    {
      ei1=i;
    }
        if(se2==arr[i])
    {
      ei2=i;
    }
  }
  printf("%d\n",ei1);
  printf("%d\n",ei2);
  return 0;
}