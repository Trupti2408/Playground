#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  if(b==0)
    cout<<100-a;
  else if(a>b)
    cout<<100-a+b;
  else
    cout<<b-a;
}