#include<stdio.h>
int main()
{
  int num,r,s;
  scanf("%d",&num);
  r=num%10;
  s=num/100;
  
  printf("%d",r+s);
  return 0;
}