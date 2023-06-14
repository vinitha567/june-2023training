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
class Main1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int marks=sc.nextInt();
try{
if(marks<-1){
throw new AgeDoesNotFitException("Entered marks is negative please enter valid marks");
}
}
catch(AgeDoesNotFitException ex){
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}
