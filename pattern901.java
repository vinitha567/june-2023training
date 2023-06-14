import java.util.Scanner;
class pattern901{
public static void printPattern(char c,int n){
for(int i=0;i<=n;i++)
{
System.out.print("#");
for(int j=0;j<=n;j++)
System.out.println(c);
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
int n=sc.nextInt();
printPattern(c,n);
}
}
