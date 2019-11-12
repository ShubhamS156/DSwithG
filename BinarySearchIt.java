import java.util.*;

public class BinarySearchIt{
  int binSearch(int len,int query,int l,int r,int[] array){
    int mid=(l+r)/2;
    while(l<=r){
      if(array[mid]==query){
        return mid;
      }

      if(query>array[mid]){
        l=mid+1;
      }
      else{
        r=mid-1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    BinarySearchIt obj=new BinarySearchIt();
    System.out.println("Enter length of the array");
    int lengthOfArray=scan.nextInt();
    int[] array=new int[lengthOfArray];
    System.out.println("Enter an array of "+lengthOfArray+" elements");
    for(int i=0;i<lengthOfArray;i++){
      array[i]=scan.nextInt();
    }
    System.out.println("Array Recorded is: "+Arrays.toString(array));
    System.out.println("Enter query: ");
    int query=scan.nextInt();
int position= obj.binSearch(lengthOfArray,query,0,lengthOfArray-1,array);
if(position==-1){
  System.out.println("Element not found");
}
else{
  System.out.println("Element found at index "+position);
}
  }
}
