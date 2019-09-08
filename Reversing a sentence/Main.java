#include<stdio.h>
#include<string.h>
#define MAX_SIZE 100
int main()
{
  char str[100],reverse[100];
  int len,i,index,ws,we;
  gets(str);
  len = strlen(str);
  index=0;
  ws=len-1;
  we=len-1;
  while(ws>0)
  {
    if(str[ws]==' ')
    {
      i=ws+1;
      while(i<=we)
      {
        reverse[index]=str[i];
        i++;
        index++;
      }
      reverse[index++]=' ';
      we=ws-1;
    }
    ws--;
  }
  for(i=0;i<=we;i++)
  {
    reverse[index]=str[i];
    index++;
  }
  reverse[index]='\0';
  printf("%s",reverse);
  return 0;
}