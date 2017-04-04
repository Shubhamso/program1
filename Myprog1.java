import java.util.Scanner;
public class  Myprog1{
	int salary;
	String str;
	Myprog1(){
		System.out.println(salary);
		
	}
	public Myprog1(int sal){
		salary=sal*20;
		
	}
		public Myprog1(String c){
		this.str=c;
		
	}
	void output(){
		
		System.out.println(salary);
		
	}
	void out(){
		System.out.println(str);
	}
	public static void main(String[] args){
		Myprog1  a= new Myprog1(10);
		Myprog1  z= new Myprog1("hello");
		Myprog1  s = new Myprog1();
		a.output();
		z.out();
		Scanner s1= new Scanner (System.in);
		int s2=  s1.nextInt();	
		System.out.println(s2);
		double d= s1.nextDouble();
		System.out.println(d);
		String s5 = s1.next();
		System.out.println(s5);
		
	}
	
}