class Demo{
	int i;
	int [] a;
	a= new int [];
public void display(){
System.out.println("Hello");
}
public void show(){
	
	for(i=0;i<2;i++){
		
		System.out.println(""+a[i]);
	}
}
}
public class New{

public static void main(String [] args){
Demo a= new Demo();
Demo c= new Demo();
//c=a;
c.display();
a.display();
c=a;
c.show();	
}
}