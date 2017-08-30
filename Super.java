class abc{

int a;
void display(){

System.out.println("white");
}
void show(){
super.display();

}}
public class Super extends abc{
void display(){
System.out.println("Black");
}

public static void main(String []args){

Super a=new Super();
abc c= new abc();
c.show();

}}