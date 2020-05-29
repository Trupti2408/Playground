#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  int a=d1+d2;
  int b=c1+c2;
  while(b>100)
  {
    b=b-100;
    a=a+1;
  }
  cout<<a<<"\n"<<b;
}