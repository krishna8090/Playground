#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a;
  if(a<=200)
  {
    b=a*0.5;
    std::cout<<"Rs."<<b;
  }
  else if(a<=400)
    std::cout<<"Rs."<<a*0.65+100;
  else if(a<=600)
    std::cout<<"Rs."<<a*0.8+200;
  else
    std::cout<<"Rs."<<a*1.25+425;
}