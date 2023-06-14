import javatil.Scanner;
class palindrome703
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String strobj=sc.nextLine();
strobj=strobj.toUpperCase();
String temp="";
int ascii;
for(int i=0;i<=strobj.length();i++)
{
if(strobj.charAt(i)>='A'&& strobj.charAt(i)<='Z')
 {ascii=strobj.charAt(i);
  ascii +=32;
temp=temp+(char)ascii;
}
else
{temp=temp+strobj.charAt(i);}
}
System.out.println("temp:"+temp);
strobj=temp;
String rev="";
for(int i=0;i<=strobj.length();i++){rev=rev+strobj.charAt(i);}
if(strobj.equals(rev))
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}
