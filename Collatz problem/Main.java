#include<iostream>
using namespace std;
int main()
{
  int n,m,i=0;
  cin>>n;
  m=n;
  cout<<m;
  while(n!=1)
  {
    if(n%2==0)
    {
      n=n/2;
      cout<<"\n"<<n;
    }
    else
    {
     n=3*n+1; 
      cout<<"\n"<<n;
    }
    i++;
  }
  cout<<"\n"<<i;
}