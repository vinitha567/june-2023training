import java.util.Scanner;
class StudentException extends Exception
{
Scanner sc=new Scanner(System.in);
int id=sc.nextInt();
String name=sc.next();
int marks=sc.nextInt();
class Student1
{
public static void main(String args[])
{
StudentException s=new StudentException();
System.out.println(s.id);
System.out.println(s.name);
System.out.println(s.marks);
}
}
}