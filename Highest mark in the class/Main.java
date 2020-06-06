#include<iostream>
int main()
{
  int n,b=0,i;
  std::cin>>n;
  int a[n];
  for(i=0 ; i<n ;i++)
  {
    std::cin>>a[i];
    if(a[i]>b)
      b=a[i];
  }
  std::cout<<b;
}