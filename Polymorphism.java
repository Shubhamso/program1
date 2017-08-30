class shape{
void draw(){
System.out.println("Drawing");
}
}

class Rectangle extends shape{
	
void draw(){
	System.out.println("Drawing Rectangle");
	
}	
}

class Circle extends shape{
	
void draw(){
	System.out.println("Drawing Circle");
	
}	
}
class Square extends shape{
	
void draw(){
	System.out.println("Drawing Square");
	
}	
}


public class Polymorphism{

public static void main(String [] args){

shape x= new shape();
Rectangle r= new Rectangle();
Circle c= new Circle();
Square s= new Square();
c.draw();
s.draw();
r.draw();
x.draw();
}
}