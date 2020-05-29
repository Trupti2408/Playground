#include<iostream>
using namespace std;
int largest(int arr[][70],int m,int n)
{
for(int i=0;i<n;i++)
{
	int maxm=arr[0][i];
	for(int j=1;j<m;j++)
	{
		if(arr[j][i]>maxm)
		maxm=arr[j][i];
	}
	cout<<maxm<<endl;
	}	
}
int main()
{
	int arr[70][70];
	int m,n,max1,max2,max3;
	cin>>m>>n;
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			cin>>arr[i][j];
		}
	}
	largest(arr,m,n);
}