import java.util.Scanner;

class prime{
int a,b;
public void getnum(int c, int d)
{
this.a=c;
this.b=d;
}

public void logic(){
	
	for(i=a;i<=b;i++){
	
	if(i%2==0 && i/2==1){
		System.out.println(""+i);
	}
	}
}
}
public class PrimeNum{
public static void main(String [] args){

Scanner s= new Scanner(System.in);


System.out.println("Enter the first number");
int x= s.nextInt();
System.out.println("Enter the Second number");
int y= s.nextInt();
prime p= new prime();
p.getnum(x,y);
System.out.println("Program to find the prime numbers between"+x+"and"+y);

}
}