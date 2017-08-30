class A{
void display(){System.out.println("This is class A");
}}

class B extends A{
void dis(){System.out.println("This is class B");
}}

class C extends A{
void play(){System.out.println("This is class C");
}
}

public class Hire{
public static void main(String [] args){
C x= new C();
B y= new B();

x.display(); //class c is cla class a ;
y.dis(); // class b
y.display(); //class b is calling class a;
}
}