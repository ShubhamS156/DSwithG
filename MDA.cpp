#include<iostream>
using namespace std;
int main()
{
int fa,la,i,j;
cout<<"Enter rows:\n";
cin>>fa;
cout<<"Enter columns:\n";
cin>>la;
int arr[fa][la];
cout<<"Enter row and column values:\n";
for(i=0;i<fa;i++)
{
	for(j=0;j<la;j++)
	{

		cin>>arr[i][j];
	}
}

for(i=0;i<fa;i++)
{
	for(j=0;j<la;j++)
	{
		cout<<arr[i][j];
	}
	cout<<'\n';
}
	}
