#include<iostream>
using namespace std;
int main()
{
  int n,i,sum;
  int min,max;
  cin>>min>>max;
  for(n=min;n<=max;n++)
  {
    i=1;
    sum = 0;
    while(i<n)
    {
      if(n%i==0)
        sum=sum+i;
        i++;
    }
    if(sum==n)
    printf("%d ",n);
  }

  return 0;
}