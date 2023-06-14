import java.util.Scanner;
class if_example
{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
j=sc.nextInt();
int min;
if(i<j)
{min=i;}
else
{min=j;}
System.out.println("minimum is:"+min);
}
}

