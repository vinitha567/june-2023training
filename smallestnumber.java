import java.util.Scanner;
class smallestnumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
int k=sc.nextInt();
if(i<j && i<k)
{
System.out.print(+i);
} 
if(j<k && j<i)
{
System.out.print(+j);
}
if(k<j && k<i)
{
System.out.print(+k);
}
}
}