#include <stdio.h>
int greater(int a,int b,int c);
int main(){
	int a,b,c,d;
  scanf("%d%d%d",&a,&b,&c);
 d = greater(a,b,c);
  printf("%d",d);
  	return 0;
}
int greater(int a,int b,int c){
  if(a>b && a>c)
  {
    return a;
}
  else if(b>c && b>a)
  {
    return b;
  }
  else 
  {
    return c;
  }
}