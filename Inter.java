interface a{
void display();

}
interface b{
int show();	
	
}

public class Inter implements a,b {
public void display(){
	System.out.println("hello");
}
public int show(){
	System.out.println("show is implemented");
return 0;
	}

public static void main(String [] args){

Inter a = new Inter();
a.display();
a.show();
}

}