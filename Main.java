class Person{
String name;
int age;

Person(String name, int age){
this.name = name;
this.age = age;
}

void display(){
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
}
public class Main{
public static void main(String[] args){
Person p1 = new Person("Samruddhi",20);
Person p2 = new Person("Shubham",21);
p1.display();
p2.display();
}
}
