import java.util.ArrayList;
class Main8{
public static void main(String args[]){
ArrayList<String>animals=new ArrayList<>();
animals.add("Cat");
animals.add("Dog");
animals.add("Cow");
System.out.println("ArrayList"+animals);
String str=animals.get(1);
System.out.println("Element at index 1:"+str);
str=animals.get(2);
System.out.println("Element at index 2:"+str);
}
}


