#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r;
  cin>>c;
  int arr[r][c],s;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>arr[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {s=0;
    for(int j=0;j<c;j++)
    {
      s=s+arr[i][j];
    }
    cout<<s<<"\n";
  }
  
}