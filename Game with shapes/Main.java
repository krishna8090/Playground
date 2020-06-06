#include<iostream>
using namespace std;
int main()
{
  int a,b;
  float c;
  std::cin>>a>>b;
  c=b*1.414;
  if(a*2>b)
    std::cout<<"circle cannot be inside a square";
  else
    std::cout<<"circle can be inside a square";
}