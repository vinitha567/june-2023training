import java.util.Scanner;
class PorNot{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<=n;i++)
{
if(i%n!=0)
{
System.out.print("YES");
}
else if((n==0)||(n==1))
{
System.out.print("NO");
}
}
}
}