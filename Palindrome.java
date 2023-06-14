import java.util.Scanner;
public class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int pd=0;
int num=n;
while(n>10)
{
pd=pd*10+(n%10);
n=n/10;
}
if(n==pd)
{System.out.println("is a palindrome");}
else
{System.out.println("not a palindrome");}
}
}
