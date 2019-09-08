#include<stdio.h>
int calpow(int,int);
int main(){
  int b,e;
  scanf("%d%d",&b,&e);
  calpow(b,e);
}
int calpow(int b,int e)
{
  int power = 1;
  while(e>0)
  {
    power = power*b;
    e--;
  }
  printf("%d",power);
  return power;
}
    
  
    
  	
