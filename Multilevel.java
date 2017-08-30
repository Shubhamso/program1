class A{
void display(){System.out.println("This is class A");
}}

class B extends A{
void dis(){System.out.println("This is class B");
}}

class C extends B{
void play(){System.out.println("This is class C");
}
}

public class Multilevel{
public static void main(String [] args){
C x= new C();

x.display();
x.dis();
x.play();

}
}