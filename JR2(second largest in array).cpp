#include<iostream>
#include <climits>
using namespace std;
int i,n,arr[10];
int slargest(int arr[],int n)
{
    int max= INT_MIN;
    int smax= INT_MIN;
    for(i=0; i<n; i++)
    {
        if(max<arr[i])
        {
            int smax=max;
            max=arr[i];
        }
        else
        {
         if(arr[i]>smax and arr[i]<max) 
        {
            smax=arr[i];
        }
    }   }
return smax;
}

int main()
{
    int arr[]={1,8,5,7,4,9,3,2,6};
    cout<< "Second Largest Element:"<< slargest(arr,9);
}
