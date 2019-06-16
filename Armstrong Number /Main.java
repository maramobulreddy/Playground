#include <stdio.h>
int main()
{
int i,n,sum=0,rem,temp;
  scanf("%d",&n);
  temp=n;
  while(temp>0)
  
  {
    rem=temp%10;
    sum=sum+rem*rem*rem;
    temp=temp/10;
  }
  if(n==sum)
    printf("Armstrong Number");
  else{
    printf("Not an Armstrong Number");
  }

  
	return 0;
}