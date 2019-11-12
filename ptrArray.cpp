#include<iostream>
using namespace std;
int main(int argc, char const *argv[]) {
  double *ptrArray[3];
  double array[3]={1,2,3};
  for(int i=0;i<3;i++){
    ptrArray[i]=&array[i];
cout<<ptrArray[i]<<'\n';
  }

  return 0;
}
