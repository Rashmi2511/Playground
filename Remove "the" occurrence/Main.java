#include<stdio.h>
#include<string.h>
int main()
{ 
  char s[100],t[26];
  scanf("%[^\n]s",s);
  int i=0;
  for(int i1=0;s[i1]!='\0';i1++)
  {
    if((s[i1]=='t' || 'T') && s[i1+1]=='h' && s[i1+2]=='e')
    {
      i1=i1+3;
    }
    else{
      t[i]=s[i1];
      i++;
    }
  }
  t[i]='\0';
  printf("%s\n",t);
   return 0;
}