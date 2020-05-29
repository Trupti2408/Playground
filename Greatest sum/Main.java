#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int arr[r][c],sr,sc,maxr=0,maxc=0,idx=-1,idx1=-1;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>arr[i][j];
    }
  }
  cout<<"Sum of rows is ";
  for(int i=0;i<r;i++)
  {sr=0;
    for(int j=0;j<c;j++)
    {
      sr=sr+arr[i][j];
      
    }
    cout<<sr<<" ";
   if(sr>maxr)
   { maxr=sr;
    idx=i;
   }
  }  
  cout<<"\nRow "<<idx+1<<" has maximum sum";
  cout<<"\nSum of columns is ";
    for(int i=0;i<r;i++)
  {sc=0;
    for(int j=0;j<c;j++)
    {
      sc=sc+arr[j][i];
      
    }
    cout<<sc<<" ";
   if(sc>maxc)
   { maxc=sc;
    idx1=i;
   }
  }
  cout<<"\nColumn "<<idx1+1<<" has maximum sum";
}