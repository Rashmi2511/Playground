#include<stdio.h>
int main()
{
	char s[100],c;
  int i,key;
  scanf("%[^\n]s",s);
  scanf("%d",&key);
  key=key%26;
  for(i=0;s[i]!='\0';i++)
  {
    c=s[i];
    if(c>='a' && c<='z')
    {
      c=c-key;
      if(c<'a')
      {
        c=c+'z'-'a'+1;
      }
      s[i]=c;
    }
    else if(c>='A' && c<='Z')
    {
      c=c-key;
      if(c<'A')
      {
        c=c+'Z'-'A'+1;
      }
      s[i]=c;
    }
  }
  printf("%s",s);
  return 0;
}