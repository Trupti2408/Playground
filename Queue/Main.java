#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,x=0;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  for(int i=0;i<n;i++)
  {
    x=x+a[i];
  }
   if(n==1&&m==2)
     x=1;
   else
     x=(x/m)+1;
  cout<<x;
}