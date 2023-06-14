import java.util.*;
class StudentMarks extends Exception{
String msg;
StudentMarks(String msg){
super(msg);
this.msg=msg;
}
public String toString(){
return msg;
}
}
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int marks=sc.nextInt();
try{
if(marks<18){
throw new AgeDoesNotFitException("Entered age doesn't fulfill the required age limit");
}
}
catch(AgeDoesNotFitException ex){
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}
