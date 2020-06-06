#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  std::cin>>a>>b>>c;
  if( (b>a && b<c) || (b<a && b>c) )
  {
    std::cout<<"The treasure is in box which has number "<<b;
    if(a>c)
      d=c;
    else
      d=a;
  }
  else if( (c>a && c<b) || (c<a && c>b) )
  {
    std::cout<<"The treasure is in box which has number "<<c;
    if(a>b)
      d=b;
    else
      d=a;
    }
    else
    {
       std::cout<<"The treasure is in box which has number "<<a;
         if(b>c)
           d=c;
         else
           d=b;
    }
  if(a%d==0 && b%d==0 && c%d==0)
    std::cout<<"\nThe code to open the box is "<<d;
  else
    std::cout<<"\nThe code to open the box is 1";
}