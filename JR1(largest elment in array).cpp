#include<iostream>
using namespace std;
int i,n,arr[10];
int largestElement(int arr[], int n)
{
   int max = arr[0];
    for (i=0;i<n;i++)
    {
        if(max<arr[i])
        {
            max=arr[i];
        }
    }
return max;
}

int main()
{
    int arr[]={1,3,4,5,2};
    cout << "Largest Number" << largestElement(arr,5);
}
