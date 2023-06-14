import java.util.Scanner;
class A1{
public static void printPattern(int n)
{
for(int i=0;x<=n;i++)
{
printLine(i);System.out.println();
if(i<stop)
System.out.print(",");
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printLine(0,0);System.out.println();
printLine(1,2);System.out.println();
printLine(3,5);System.out.println();
printLine(6,9);System.out.println();
}
}