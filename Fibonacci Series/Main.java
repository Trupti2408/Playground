#include<iostream>  
using namespace std;
int fib(int n)
{
  if((n==1)||(n==0))
  {
    return(n);
  }
  else
  {
    return(fib(n-1)+fib(n-2));
  }
}
int main()
{
  int n,i=0,t;
  cin>>n;
  while(i<n)
  {
    t=fib(i);
    i++;
  } 
  cout<<"The term "<<n<<" in the fibonacci series is "<<t;
  return 0;
}