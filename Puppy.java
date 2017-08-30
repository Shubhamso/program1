

public class Puppy{
int name;
int size=10;
public Puppy(){
System.out.println("this is my puppy");

}
public Puppy(String na){
System.out.println("my puppy name is "+na);
}
public Puppy(int age){
age=age+size;
System.out.println("my puppy age is "+age);

}

public static void main (String [] args){

Puppy p1=new Puppy("mojo");
Puppy p= new Puppy();
Puppy p2= new Puppy(10);
}
}