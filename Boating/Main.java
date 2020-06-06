#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  std::cin>>a>>b>>c;
  d=b*75+c*30;
  if(d>a)
    std::cout<<"Boat will drow";
  else
    std::cout<<"Boat is stable";
}