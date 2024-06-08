//Generic classes and functions 
//To make a piece of code to work on different data types
//Example: Swap code can swap any type of information
//swap function will be coded once and can be called many times using different data types
#include<iostream>
using namespace std;
template <class GT>
void swap1(GT &a, GT &b)
{
    GT t=a;
    a=b;
    b=t;
}
int main()
{
    int a = 10, b = 20;
    swap1(a,b);
    float c = 10.2, d = 13.2;
    swap1(c,d);
    cout<<a<<" "<<b<<endl;
    cout<<c<<" "<<d<<endl;
    return 0;
}
