class Demo{
	
	int i;
	void display(){
		
		System.out.println("Value of i= "+i);
	}
	{
		i=200; //instance is executing first 	
	}
	
	void show(){
		System.out.println("this is Declared first");
	}
		
		{System.out.println("This is Declared second");}
	}


public class Instance{
	int show(){
		System.out.println("this is Declared first");
	return 0;
	}
		
		{System.out.println("This is Declared second");}
	
public static void main(String [] args){
Demo d= new Demo();
d.display();
d.show();
Instance b= new Instance();

b.show();
}
}