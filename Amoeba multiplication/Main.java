#include<iostream>
using namespace std;
int main()
{ 
  double i, first=0, second=1, next,n; 
  cin>>n;
  for(i=1;i<n;i++) 
  {
    next=first+second;
    first=second;
    second=next; 
  } 
  cout<<first;
}