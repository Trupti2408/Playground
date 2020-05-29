#include<iostream>
#include<string.h>
using namespace std;
struct employee
{
  char name[20];
  int id;
  int age;
  char designation[20];
  int salary;
};
int main()
{
  struct employee e;
  cout<<"Enter name:"<<"\n";
  gets(e.name);
  cout<<"Enter ID:"<<"\n";
  cin>>e.id;
  cout<<"Enter age:"<<"\n";
  cin>>e.age;
  cout<<"Enter designation:"<<endl;
  for(int i=0;i<7;i++)
  { cin>>e.designation[i];
  	continue;}
  //gets(e.designation);
  cout<<"Enter Salary:"<<"\n";
  cin>>e.salary;
  
  //output
  cout<<"Employee Details"<<"\n";
  cout<<"Name of the Employee : ";
  puts(e.name);
  cout<<"ID of the Employee : "<<e.id<<"\n";
  cout<<"Age of the Employee : "<<e.age<<endl;
  cout<<"Designation of the Employee : ";
  for(int i=0;i<7;i++)
    cout<<e.designation[i];
 // puts(e.designation);
  cout<<"\n";
  cout<<"Salary of the Employee : "<<e.salary<<endl;
  
 
}