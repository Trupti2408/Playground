#include<iostream>
using namespace std; 
int gcd(int m,int n)
{
  int rem;
  while(n!=0)
  {
    rem=m%n;
    m=n;
    n=rem;
  }
  return(m);
}
int main()
{
  int num1,num2,num3,gcd1,gcd2,t;
  cin>>num1;
  cin>>num2;
  cin>>num3;
  cin>>t;
  if(num1==0 && num2==0 && num3==0)
  {
    exit(0);
  }
  gcd1=gcd(num1,num2);
  gcd2=gcd(num3,gcd1);
  if(gcd2==t)
  {
    cout<<"Answer is correct.";
  }
  else
  {
    cout<<"Answer is wrong.";
  }
  return 0;
}
