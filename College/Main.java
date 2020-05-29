#include<iostream>
#include<iomanip>
using namespace std;
struct College
{
  char name[100];
  char city[100];
  int establishmentYear;
  float passPercentage;
}s[50];
int main()
{
  
  cout<<"Enter the number of colleges"<<endl;
  int n;
  cin>>n;
 // struct College s[n];
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1<<"\n";
    cout<<"Enter name"<<endl;
    cin>>s[i].name;
    cout<<"Enter city"<<"\n";
    cin>>s[i].city;
    cout<<"Enter year of establishment"<<"\n";
    cin>>s[i].establishmentYear;
    cout<<"Enter pass percentage"<<endl;
    cin>>s[i].passPercentage;
    
	}
	cout<<"Details of colleges"<<"\n";
	for(int i=0;i<n;i++)
	{
		cout<<"College:"<<i+1<<endl;
		cout<<"Name:"<<s[i].name<<endl;
      cout<<"City:"<<s[i].city<<endl;
      
		cout<<"Year of establishment:"<<s[i].establishmentYear<<endl;
		cout<<"Pass percentage:";
		cout<<s[i].passPercentage<<endl;
	}
}