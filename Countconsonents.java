import java.util.Scanner;
public class Countconsonents
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int Countconsonents=0;
for(int i=0;i<=str.length()-1;i++)
{
if((str.charAt(i)=='a')||(str.charAt(i)=='A')
||(str.charAt(i)=='e')||(str.charAt(i)=='E')
||(str.charAt(i)=='i')||(str.charAt(i)=='I')
||(str.charAt(i)=='o')||(str.charAt(i)=='O')
||(str.charAt(i)=='u')||(str.charAt(i)=='U')){
System.out.println(" ");
}
else if(str.charAt(i)!=' '){
System.out.println(" ");
}
Countconsonents++;
}
System.out.print(Countconsonents);
}
}

