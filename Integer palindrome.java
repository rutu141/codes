import java.io.*;
import java.util.Scanner;
class palindrome{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Syatem.out.println("enter integer ");
int num=sc.nextInt();
int onum=num;
int r=0;
int rnum=0;
while(num!=0)
{
r=num%10;
rnum=rnum*10+r;
num=num/10;
}
if(onum==rnum){
System.out.println("number is a palindrome");
}
else{
System.out.println("number is not a palindrome");
}
}

}
