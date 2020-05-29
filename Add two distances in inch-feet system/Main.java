#include<iostream>
using namespace std;
struct Dist
{
  int feet;
  float inch;
};
  
int main()
{
  Dist d1,d2,d3;
  cin>>d1.feet>>d1.inch;
  cin>>d2.feet>>d2.inch;
  d3.feet=d1.feet+d2.feet;
  d3.inch=d1.inch+d2.inch;
  // NOTE : 12 inch = 1 feet
 // If feet > 12 then feet = feet%12 and inch++  
    if(d3.inch > 12){
        d3.feet++;
        d3.inch = d3.inch - 12;
    } 
  cout<<d3.feet<<"'"<<"-"<<d3.inch<<"\"";
}