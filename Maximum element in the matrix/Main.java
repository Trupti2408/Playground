#include<iostream>
using namespace std;
int main()
{
 int arr[70][70],m,n;
  cin>>m>>n;
  int largest=arr[0][0];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>arr[i][j];
    }
  }
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(arr[i][j]>largest)
        largest=arr[i][j];
    }
  }
  cout<<"The maximum element is "<<largest;
  
}