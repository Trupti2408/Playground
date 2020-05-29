#include<iostream>
using namespace std;
struct Time
{
  int hours;
  int mins;
  int secs;
};
Time findtimedifference(Time t1, Time t2){
 Time diff;
    if(t2.secs > t1.secs){
        --t1.mins;
        t1.secs += 60;
    }
 
    diff.secs = t1.secs - t2.secs;
    if(t2.mins > t1.mins) {
        --t1.hours;
        t1.mins += 60;
    }
     
    diff.mins = t1.mins-t2.mins;
    diff.hours = t1.hours-t2.hours;
     
    return diff;
}

int main()
{
  Time t1,t2,diff;
  cin>>t1.hours>>t1.mins>>t1.secs;
  cin>>t2.hours>>t2.mins>>t2.secs;
  diff=findtimedifference(t1,t2);
  cout<<diff.hours<<":"<<diff.mins<<":"<<diff.secs;
}