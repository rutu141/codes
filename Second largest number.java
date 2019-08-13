import java.io.*;
import java.util.Scanner;
public class compare{
public Static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]={1,8,4,6};
int n=arr.length();
System.out.println("the given array is");
for(int i=0;i<n;i++)
  {
    System.out.print(arr[i]+"\t");
  }
int large=arr[0];
int slarge=arr[0];
for(int i=0;i<n;i++)
  {
    if(arr[i]>large)
      {
        slarge=large;
        large=arr[i];
      }
    else if(arr[i]>slarge)
      {
        slarge=arr[i];
      }
  }
  System.out.println("Second largest number is"+slarge);
}
}
