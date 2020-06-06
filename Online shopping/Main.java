#include<iostream>
using namespace std;
int main()
{
  float a,b,c,d,e,f,g,h,i,x,y,w;
  std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  w=a*((100-b)/100)+c;
  x=d*((100-e)/100)+f;
  y=g*((100-h)/100)+i;
  std::cout<<"In Flipkart Rs."<<w;
  std::cout<<"\nIn Snapdeal Rs."<<x;
  std::cout<<"\nIn Amazon Rs."<<y;
  if(w<=x && w<=y)
    std::cout<<"\nHe will prefer Flipkart";
  else if(x<w && x<y)
    std::cout<<"\nHe will prefer Snapdeal";
  else
    std::cout<<"\nHe will prefer Amazon";
  
}