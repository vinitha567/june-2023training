import java.util.Scanner;
class PatternDiamond{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
printPatternU(ch,row);
}
public static void printPatternU(char c,int n){
for(int i=n/2,j=1;j<=n;i--,j+=2)printLine
if(row%2==0)x=y=row/2;
else{x=row/2;y=row/2+1;}
printPattern(ch,x);
printReversePattern(ch,y);
}
public static void printReversePattern(char c,int n){
for(int i=n;i>=1;i--)
printLine(c,i);
System.out.print(c);
}
}
