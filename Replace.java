import java.util.Scanner;
class Replace{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String c=sc.next();
String r=sc.next();
String replace=str.replace(c,r);
System.out.println(replace);
}
}