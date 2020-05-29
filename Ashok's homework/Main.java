#include<iostream>
int main()
{
  int r, c;
  std::cin>>r>>c;
  int a[r][c],b[r][c],sum[r][c];
  for(int i = 0; i < r; i++)
  {
    for(int j = 0; j < c; j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(int i = 0; i < r; i++)
  {
    for(int j = 0; j < c; j++)
    {
      std::cin>>b[i][j];
    }
  }
   for(int i = 0; i < r; i++)
  {
    for(int j = 0; j < c; j++)
    {
      sum[i][j]=a[i][j]+b[i][j];
      std::cout<<sum[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}