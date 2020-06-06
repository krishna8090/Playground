#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a>>b;
  if(a>b)
    b=b+100;
  std::cout<<b-a;
}